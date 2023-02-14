package friendsFlatmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FriendsFlatmapTestSuite {

    @Test
    void testGetLocationsOfFriends() {
        //Given
        //Create users
        ForumUser user1 = new ForumUser("andy111223", "Andy KanMalantsky", "Salem");
        ForumUser user2 = new ForumUser("jonesbob", "Bob Jones", "Seattle");
        ForumUser user3 = new ForumUser("kate12345", "Kate Smith", "Miami");
        ForumUser user4 = new ForumUser("jackson456", "Jackson Turner", "Austin");
        ForumUser user5 = new ForumUser("nash23456", "Nash Johnson", "Denver");
        ForumUser user6 = new ForumUser("jimmyJ333", "Jimmy Johnson", "San Francisco");
        ForumUser user7 = new ForumUser("johnDoe12", "John Doe", "Los Angeles");
        ForumUser user8 = new ForumUser("janieSmith", "Janie Smith", "Houston");
        ForumUser user9 = new ForumUser("sarah12345", "Sarah Johnson", "Phoenix");
        ForumUser user10 = new ForumUser("johnLee", "John Lee", "New York");
        ForumUser user11 = new ForumUser("mikeJackson", "Mike Jackson", "Chicago");
        ForumUser user12 = new ForumUser("steveJobs", "Steve Jobs", "Las Vegas");
        ForumUser user13 = new ForumUser("tinaTurner", "Tina Turner", "Detroit");
        ForumUser user14 = new ForumUser("billGates", "Bill Gates", "Atlanta");
        ForumUser user15 = new ForumUser("jenniferAnn", "Jennifer Ann", "Dallas");
        ForumUser user16 = new ForumUser("markZuckerberg", "Mark Zuckerberg", "Minneapolis");
        ForumUser user17 = new ForumUser("jessicaSimpson", "Jessica Simpson", "Orlando");
        ForumUser user18 = new ForumUser("bradPitt", "Brad Pitt", "Philadelphia");
        ForumUser user19 = new ForumUser("angelinaJolie", "Angelina Jolie", "San Antonio");
        ForumUser user20 = new ForumUser("jenniferLawrence", "Jennifer Lawrence", "San Diego");

        //When
        //Create relations for user1
        user1.addFriend(user6);
        user1.addFriend(user9);
        user1.addFriend(user15);
        user1.addFriend(user17);
        //Create relations for user2
        user2.addFriend(user1);
        user2.addFriend(user3);
        user2.addFriend(user6);
        user2.addFriend(user10);
        //Create relations for user5
        user5.addFriend(user1);
        user5.addFriend(user2);
        user5.addFriend(user7);
        user5.addFriend(user9);
        //Create relations for user12
        user12.addFriend(user1);
        user12.addFriend(user4);
        user12.addFriend(user7);
        user12.addFriend(user16);
        //Create relations for user19
        user19.addFriend(user3);
        user19.addFriend(user5);
        user19.addFriend(user8);
        user19.addFriend(user13);

        //Then
        //user1 has 4 friends with following locations
        //          user6: "San Francisco"
        //          user9: "Phoenix"
        //          user15: "Dallas"
        //          user17: "Orlando"
        assertEquals(4, user1.getLocationsOfFriends().size());
        assertTrue(user1.getLocationsOfFriends().contains("San Francisco"));
        assertTrue(user1.getLocationsOfFriends().contains("Phoenix"));
        assertTrue(user1.getLocationsOfFriends().contains("Dallas"));
        assertTrue(user1.getLocationsOfFriends().contains("Orlando"));
        assertFalse(user1.getLocationsOfFriends().contains("Los Angeles"));
    }
//    @Test
//    void testGetLocationsOfFriendsOfFriends() {
//        //Given
//        //Create users
//        ForumUser user1 = new ForumUser("andy111223", "Andy KanMalantsky", "Salem");
//        ForumUser user2 = new ForumUser("jonesbob", "Bob Jones", "Seattle");
//        ForumUser user3 = new ForumUser("kate12345", "Kate Smith", "Miami");
//        ForumUser user4 = new ForumUser("jackson456", "Jackson Turner", "Austin");
//        ForumUser user5 = new ForumUser("nash23456", "Nash Johnson", "Denver");
//        ForumUser user6 = new ForumUser("jimmyJ333", "Jimmy Johnson", "San Francisco");
//        ForumUser user7 = new ForumUser("johnDoe12", "John Doe", "Los Angeles");
//        ForumUser user8 = new ForumUser("janieSmith", "Janie Smith", "Houston");
//        ForumUser user9 = new ForumUser("sarah12345", "Sarah Johnson", "Phoenix");
//        ForumUser user10 = new ForumUser("johnLee", "John Lee", "New York");
//
//        //When
//        //Create relations for user1
//        user1.addFriend(user6);
//        user1.addFriend(user9);
//        //Create relations for user6
}
