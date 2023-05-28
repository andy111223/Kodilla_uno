package com.kodilla.spring.portfolio;

import lombok.Getter;


public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList getDoneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.getDoneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getGetDoneList() {
        return getDoneList;
    }
}
