package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


class BoardTestSuite {
    @Test
    void testTaskAdd() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.getGetDoneList().addTask("Finished task");
        board.getToDoList().addTask("To be done");
        board.getInProgressList().addTask("Task in progress");

        //Then
        Assertions.assertEquals(board.getGetDoneList().getTasks().get(0),"Finished task");
        Assertions.assertTrue(board.getGetDoneList().getTasks().size() == 1);

        Assertions.assertEquals(board.getToDoList().getTasks().get(0),"To be done");
        Assertions.assertTrue(board.getToDoList().getTasks().size() == 1);

        Assertions.assertEquals(board.getInProgressList().getTasks().get(0),"Task in progress");
        Assertions.assertTrue(board.getInProgressList().getTasks().size() == 1);
    }
}
