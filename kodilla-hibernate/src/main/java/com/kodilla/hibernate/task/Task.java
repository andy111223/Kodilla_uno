package com.kodilla.hibernate.task;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "TASKS")
public final class Task {
    @Id
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

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }
    @Column(name = "DURATION")
    public int getDuration() {
        return duration;
    }
    @Column(name = "CREATED")
    @NotNull
    public Date getCreated() {
        return created;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
