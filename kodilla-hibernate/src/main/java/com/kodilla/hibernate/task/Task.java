package com.kodilla.hibernate.task;

import java.util.Date;

public class Task {
    private int id;
    private String description;
    private Date created;
    private int duration;

    public Task() {
    }

    public Task(String description, int duration) {
        this.description = description;
        this.created = new Date();
        this.duration = duration;
    }
    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }

    public int getDuration() {
        return duration;
    }
}
