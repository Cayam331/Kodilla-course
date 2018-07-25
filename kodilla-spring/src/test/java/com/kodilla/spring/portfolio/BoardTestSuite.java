package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.doneList.addTask("Odkurzanie");
        board.inProgressList.addTask("Sprzatanie");
        board.toDoList.addTask("Bieganie");
        //Then
        System.out.println(board.doneList.toString());
        System.out.println(board.inProgressList.toString());
        System.out.println(board.toDoList.toString());


    }
}
