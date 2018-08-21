package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeCompaniesFacadeTestSuite {

    @Autowired
    private EmployeeCompaniesFacade employeeCompaniesFacade;

    @Test
    public void testFindEmployeeByName() {
        //Given
        Employee employee1 = new Employee("Krzysztof", "Krawczyk");
        Employee employee2 = new Employee("Krzysztof", "Krawczynski");
        Employee employee3 = new Employee("Bill", "Gates");

        employeeCompaniesFacade.employeeDao.save(employee1);
        employeeCompaniesFacade.employeeDao.save(employee2);
        employeeCompaniesFacade.employeeDao.save(employee3);

        int id1 = employee1.getId();
        int id2 = employee2.getId();
        int id3 = employee3.getId();

        //When
        List<Employee> resultList = employeeCompaniesFacade.getEmployeeByName("raw");

        //Then
        Assert.assertEquals(2, resultList.size());

        //CleanUp
        try {
            employeeCompaniesFacade.employeeDao.delete(id1);
            employeeCompaniesFacade.employeeDao.delete(id2);
            employeeCompaniesFacade.employeeDao.delete(id3);

        } catch (Exception e) {
            //do nothing
        }
    }

    @Test
    public void testFindCompanyByName() {
        //Given
        Company company1 = new Company("Microsoft");
        Company company2 = new Company("Januszsoft");

        employeeCompaniesFacade.companyDao.save(company1);
        employeeCompaniesFacade.companyDao.save(company2);

        int id1 = company1.getId();
        int id2 = company2.getId();

        //When
        List<Company> resultList = employeeCompaniesFacade.getCompanyByName("soft");

        //Then
        Assert.assertEquals(2, resultList.size());

        //CleanUp
        try {
            employeeCompaniesFacade.companyDao.delete(id1);
            employeeCompaniesFacade.companyDao.delete(id2);
        } catch (Exception e) {
            //do nothing
        }
    }

}
