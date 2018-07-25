package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter;

    @BeforeClass
    public static void testSuiteStart() {
        System.out.println("Test suite has started");
    }

    @AfterClass
    public static void testSuiteStop() {
        System.out.println("Test suite has ended");
    }

    @Before
    public void testCaseStart() {
        testCounter++;
        System.out.println("Test number: " + testCounter);
    }

    @After
    public void testCaseStop() {
        System.out.println("Test case has ended");
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        //When
        boolean result = shapeCollector.addFigure(circle);
        //Then
        Assert.assertEquals(shapeCollector.listOfFigures.size(), 1);
        Assert.assertEquals(shapeCollector.listOfFigures.contains(circle), true);
        Assert.assertTrue(result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        shapeCollector.listOfFigures.add(circle);
        //When
        boolean result = shapeCollector.removeFigure(circle);
        //Then
        Assert.assertEquals(shapeCollector.listOfFigures.size(), 0);
        Assert.assertEquals(shapeCollector.listOfFigures.contains(circle), false);
        Assert.assertTrue(result);
    }

    @Test
    public void testFindFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square();
        Circle circle = new Circle();
        shapeCollector.listOfFigures.add(circle);
        shapeCollector.listOfFigures.add(square);
        //When
        Shape shape = shapeCollector.getFigure(1);
        //Then
        Assert.assertEquals(shape, square);
    }

    @Test
    public void testShowFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square();
        shapeCollector.listOfFigures.add(square);
        //When
        shapeCollector.showFigures();
        //Then
        Assert.assertEquals(1, shapeCollector.listOfFigures.size());
    }

}
