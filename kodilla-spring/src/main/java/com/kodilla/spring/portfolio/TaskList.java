package com.kodilla.spring.portfolio;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public final class TaskList {
    private List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public List<String> addTask(String task) {
        tasks.add(task);
        return tasks;
    }
    public List<String> getTasks() {
        return tasks;
    }

    @Override
    public String toString() {
        return "TaskList{" +
                "tasks=" + tasks +
                '}';
    }
}
