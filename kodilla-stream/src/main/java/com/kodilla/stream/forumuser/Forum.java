package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public final class Forum {

    private final List<ForumUser> forumUserList = new ArrayList<>();

    public Forum() {
        forumUserList.add(new ForumUser(100, "andy111223", 'M', LocalDate.of( 1982 , 11, 27 ), 10));
        forumUserList.add(new ForumUser(201, "landy223", 'M', LocalDate.of( 1992 , 10, 27 ), 0));
        forumUserList.add(new ForumUser(302, "dy1223", 'F', LocalDate.of( 2002 , 1, 30 ), 30));
        forumUserList.add(new ForumUser(403, "ylon23", 'M', LocalDate.of( 2000 , 10, 11 ), 25));
        forumUserList.add(new ForumUser(504, "anan1112", 'M', LocalDate.of( 2010 , 5, 7 ), 10));
        forumUserList.add(new ForumUser(605, "anna11223", 'F', LocalDate.of( 1999 , 7, 3 ), 50));
        forumUserList.add(new ForumUser(706, "hania2223", 'F', LocalDate.of( 1995 , 3, 15 ), 6));
        forumUserList.add(new ForumUser(807, "marika-044", 'F', LocalDate.of( 1948 , 8, 10 ), 12));
        forumUserList.add(new ForumUser(908, "kulfon_13", 'M', LocalDate.of( 1982 , 9, 20 ), 35));
        forumUserList.add(new ForumUser(119, "nathaniel", 'M', LocalDate.of( 2000 , 12, 17 ), 17));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUserList);
    }
}
