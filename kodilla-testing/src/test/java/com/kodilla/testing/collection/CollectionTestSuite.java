package com.kodilla.testing.collection;

import org.junit.*;
import com.kodilla.testing.collection.OddNumbersExterminator;

import java.util.ArrayList;

public class CollectionTestSuite {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Before
    public void before() {
        System.out.println("Test case: begin");
    }

    @After
    public void after() {
        System.out.println("Test case: end");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> emptyList = new ArrayList<Integer>();
        //When
        System.out.println("Testing case with empty list");
        result = exterminator.exterminate(emptyList);
        //Then
        Assert.assertEquals(result.size(), 0);
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> result = new ArrayList<Integer>();
        ArrayList<Integer> listWithNumbers = new ArrayList<Integer>();
        listWithNumbers.add(5);
        listWithNumbers.add(10);
        listWithNumbers.add(2);
        listWithNumbers.add(3);
        //When
        System.out.println("Testing case with list with numbers");
        result = exterminator.exterminate(listWithNumbers);
        //Then
        Assert.assertEquals(result.size(), 2);
        Assert.assertEquals(result.contains(2), true);
        Assert.assertEquals(result.contains(10), true);
    }
}
