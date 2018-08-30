package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class TasksQueueTestSuite {
    @Test
    public void testUpdate(){
        //Given
        Mentor mentor1 = new Mentor("Adrian");
        Mentor mentor2 = new Mentor("Andrzej");
        TasksQueue tasksQueue1 = new TasksQueue("Eryk");
        TasksQueue tasksQueue2 = new TasksQueue("Konrad");
        TasksQueue tasksQueue3 = new TasksQueue("Krzysztof");
        tasksQueue1.registerObserver(mentor1);
        tasksQueue2.registerObserver(mentor1);
        tasksQueue3.registerObserver(mentor2);

        //When
        tasksQueue1.addTask("Task 1");
        tasksQueue1.addTask("Task 2");
        tasksQueue2.addTask("Task 3");
        tasksQueue3.addTask("Task 4");
        tasksQueue3.addTask("Task 5");
        tasksQueue3.addTask("Task 6");

        //Then
        Assert.assertEquals(mentor1.getUpdateCount(), 3);
        Assert.assertEquals(mentor2.getUpdateCount(), 3);


    }
}
