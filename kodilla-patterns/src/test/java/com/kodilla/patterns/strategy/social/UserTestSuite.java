package com.kodilla.patterns.strategy.social;


import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies(){
        //Given
        User user1 = new Millenials("Kowalski");
        User user2 = new ZGeneration("Malinowski");
        User user3 = new YGeneration("Rutkowski");
        //When
        String user1Result = user1.sharePost();
        String user2Result = user2.sharePost();
        String user3Result = user3.sharePost();
        //Then
        Assert.assertEquals("favorite communication channel: Facebook", user3Result);
        Assert.assertEquals("favorite communication channel: SnapChat", user1Result);
        Assert.assertEquals("favorite communication channel: Twitter", user2Result);
    }

    @Test
    public void testIndividualSharingStrategy(){
        //Given
        User user = new ZGeneration("Kowalski");
        user.setSocialPublisher(new FacebookPublisher());
        //When
        String result = user.sharePost();
        //Then
        Assert.assertEquals("favorite communication channel: Facebook", result);

    }
}
