package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }
    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(5, counter);
    }
    @Test
    public void testSelectUsersAndPosts() throws SQLException{
        //Given
        DbManager dbManager = DbManager.getInstance();
        //When
        String sqlQuery = "SELECT concat(U.FIRSTNAME, \" \", U.LASTNAME) AS \"IMIE I NAZWISKO\", COUNT(*) AS \"LICZBA POSTOW\"\n" +
                "FROM USERS U, POSTS P\n" +
                "WHERE U.ID = P.USER_ID\n" +
                "GROUP BY U.LASTNAME\n" +
                "HAVING COUNT(*)>2\n" +
                " ";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);
        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getString("IMIE I NAZWISKO") + ", " +
                    rs.getString("LICZBA POSTOW"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(1, counter);
    }
}