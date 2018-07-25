package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testCreateShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Tasks shoppingTask = taskFactory.createTask(TaskFactory.ShoppingTask);
        shoppingTask.executeTask();
        boolean result = shoppingTask.isTaskExecuted();
        //Then
        Assert.assertEquals("Dinner ingredigents", shoppingTask.getTaskName());
        Assert.assertEquals(true, result);

    }
    @Test
    public void testCreateDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Tasks drivingTask = taskFactory.createTask(TaskFactory.DrivingTask);
        drivingTask.executeTask();
        boolean result = drivingTask.isTaskExecuted();
        //Then
        Assert.assertEquals("Pick up children", drivingTask.getTaskName());
        Assert.assertEquals(true, result);

    }
    @Test
    public void testCreatePaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Tasks paintingTask = taskFactory.createTask(TaskFactory.PaintingTask);
        boolean result = paintingTask.isTaskExecuted();
        //Then
        Assert.assertEquals("House painting", paintingTask.getTaskName());
        Assert.assertEquals(false, result);

    }
}
