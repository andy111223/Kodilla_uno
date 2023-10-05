package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class HomeworkQueue implements Observable {

    private final List<Observer> observers;
    private final Queue<String> tasks;
    private final String name;

    public HomeworkQueue(String name) {
        observers = new ArrayList<>();
        tasks = new LinkedList<>();
        this.name = name;
    }
    public void addTask(String task) {
        tasks.add(task);
        notifyObservers();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public Queue<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
