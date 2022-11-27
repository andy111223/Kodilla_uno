package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }
    @AfterAll
    public static void afterAllTest() {
        System.out.println("All tests are finished");
    }

    @Test
    public void testCalculateAdvStatisticsZeroPosts() {

        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getPostsQty());

    }
    @Test
    public void testCalculateAdvStatistics1000Posts() {

        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(1000, forumStatistics.getPostsQty());

    }
    @Test
    public void testCalculateAdvStatisticsZeroComments() {

        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getCommentsQty());
    }
    @Test
    public void testCalculateAdvStatisticsCommentsLessThanPosts() {

        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(10);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(10, forumStatistics.getPostsQty());
        assertEquals(5, forumStatistics.getCommentsQty());
        assertEquals(0.5, forumStatistics.getCommentsAvgPerPost());
    }
    @Test
    public void testCalculateAdvStatisticsCommentsMoreThanPosts() {

        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(8);
        when(statisticsMock.postsCount()).thenReturn(4);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(4, forumStatistics.getPostsQty());
        assertEquals(8, forumStatistics.getCommentsQty());
        assertEquals(2, forumStatistics.getCommentsAvgPerPost());
    }
    @Test
    public void testCalculateAdvStatisticsZeroUsers() {

        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> usersList = new ArrayList<>();
        for(int i=0; i<0; i++) {
            usersList.add("User");
        }
        when(statisticsMock.userNames()).thenReturn(usersList);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(0, forumStatistics.getUsersQty());
    }
    @Test
    public void testCalculateAdvStatistics100Users() {

        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> usersList = new ArrayList<>();
        for(int i=0; i<100; i++) {
            usersList.add("User");
        }
        when(statisticsMock.userNames()).thenReturn(usersList);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        assertEquals(100, forumStatistics.getUsersQty());
    }

}
