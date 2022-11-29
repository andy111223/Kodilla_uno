package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Period;

import static java.time.LocalTime.now;

public final class ForumUser {

    private final int id;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int numberOfPosts;

    public ForumUser(int id, String userName, char sex, LocalDate dateOfBirth, int numberOfPosts) {
        this.id = id;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPosts = numberOfPosts;
    }

    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "ID='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                "numberOfPosts='" + numberOfPosts + '\'' +
                '}';
    }
}

