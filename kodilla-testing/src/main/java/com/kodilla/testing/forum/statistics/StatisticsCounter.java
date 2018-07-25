package com.kodilla.testing.forum.statistics;


import java.util.List;

public class StatisticsCounter {

    public int numberOfUsers;
    public int numberOfPosts;
    public int numberOfComments;
    public double averageUserPosts;
    public double averageUserComments;
    public double averageCommentsPerPost;


    public void calculateAdvStatistics(Statistics statistics) {
        List<String> listWithUsers = statistics.userNames();
        numberOfUsers = listWithUsers.size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfUsers == 0 || numberOfPosts == 0) {
            averageUserPosts = 0;
        } else {
            averageUserPosts = numberOfUsers / numberOfPosts;
        }
        if (numberOfUsers == 0 || numberOfComments == 0) {
            averageUserComments = 0;
        } else {
            averageUserComments = numberOfUsers / numberOfComments;
        }
        if (numberOfPosts == 0 || numberOfComments == 0) {
            averageCommentsPerPost = 0;
        } else {
            averageCommentsPerPost = numberOfPosts / numberOfComments;
        }
    }
}
