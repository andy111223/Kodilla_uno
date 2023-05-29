package com.kodilla.patterns.prototype;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class BoardTestSuite {
    @Test
    void testToString() {
        //Given
        //Creating the task-list for todos
        TasksList listToDo = new TasksList("To do Tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listToDo.getTasks().add(new Task("To Do task no. " + n)));
        //Creating the task-list for tasks in progress
        TasksList listInProgress = new TasksList("In Progress tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listInProgress.getTasks().add(new Task("In Progress task no. " + n)));
        //Creating the task-list for done tasks
        TasksList listDone = new TasksList("Done tasks");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> listDone.getTasks().add(new Task("Done task no. " + n)));
        //Creating the board and assigning the lists
        Board board = new Board("Project no. 1");
        board.getLists().add(listToDo);
        board.getLists().add(listInProgress);
        board.getLists().add(listDone);

        //Making a shallow copy of the board object
        Board clonedBoard = null;
        try {
            clonedBoard = board.shallowCopy();
            clonedBoard.setName("Project no. 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //Making a deep copy of the board object
        Board deepClonedBoard = null;
        try {
            deepClonedBoard = board.deepCopy();
            deepClonedBoard.setName("Project no. 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        //NEW: removing elements
        board.getLists().remove(listToDo);
        //Then
        System.out.println(board);
        System.out.println(clonedBoard);
        System.out.println(deepClonedBoard);

        assertEquals(2, board.getLists().size());
        assertEquals(2, clonedBoard.getLists().size());
        assertEquals(3,deepClonedBoard.getLists().size());
        assertEquals(clonedBoard.getLists(),board.getLists());
        assertNotEquals(deepClonedBoard.getLists(),board.getLists());
    }
}
