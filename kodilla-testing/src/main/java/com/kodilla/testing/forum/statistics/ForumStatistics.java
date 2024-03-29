package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int usersQty;
    private int postsQty;
    private int commentsQty;
    private double postsAvgPerUser;
    private double commentsAvgPerUser;
    private double commentsAvgPerPost;

    public int getUsersQty() {
        return usersQty;
    }

    public int getPostsQty() {
        return postsQty;
    }

    public int getCommentsQty() {
        return commentsQty;
    }

    public double getPostsAvgPerUser() {
        return postsAvgPerUser;
    }

    public double getCommentsAvgPerUser() {
        return commentsAvgPerUser;
    }

    public double getCommentsAvgPerPost() {
        return commentsAvgPerPost;
    }

    public void calculateAdvStatistics (Statistics statistics) {

        usersQty = statistics.userNames().size();
        postsQty = statistics.postsCount();
        commentsQty = statistics.commentsCount();
        postsAvgPerUser = postsAvgPerUser();
        commentsAvgPerUser = commentsAvgPerUser();
        commentsAvgPerPost = commentsAvgPerPost();
    }

    public double postsAvgPerUser() {
        if (usersQty > 0) {
           return (double) postsQty/usersQty;
        } else {
            return 0;
        }
    }

    public double commentsAvgPerUser() {
        if (usersQty > 0) {
            return (double) commentsQty/usersQty;
        } else {
            return 0;
        }
    }
     public double commentsAvgPerPost() {
        if (postsQty > 0) {
            return (double) commentsQty/postsQty;
        } else {
            return 0;
        }
     }

    public void showStatistics() {
        System.out.println("Users quantity: " + usersQty);
        System.out.println("Posts quantity: " + postsQty);
        System.out.println("Comments quantity: " + commentsQty);
        System.out.println("Posts average per user: " + postsAvgPerUser);
        System.out.println("Comments average per user: " + commentsAvgPerUser);
        System.out.println("Comments average per post: " + commentsAvgPerPost);
    }
}
