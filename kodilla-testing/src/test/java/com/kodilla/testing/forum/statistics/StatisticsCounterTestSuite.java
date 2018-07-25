package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.mockito.Mockito.*;

public class StatisticsCounterTestSuite {
    static int testCounter = 1;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Starting test suite");
    }

    @AfterClass
    public static void AfterClass() {
        System.out.println("Ending test suite");
    }

    @Before
    public void before() {
        System.out.println("Executing test number: " + testCounter);
    }

    @After
    public void after() {
        System.out.println("Test number: " + testCounter + " positive");
        testCounter++;
    }

    @Test
    public void testCalculateAdvStatisticsRandomData() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNames = new ArrayList<String>();
        userNames.add(0, "Eryk");
        userNames.add(1, "Konrad");
        userNames.add(2, "Krzysztof");
        int numberOfPosts = 1;
        int numberOfComments = 4;

        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.userNames()).thenReturn(userNames);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCounter.numberOfUsers, 3);
        Assert.assertEquals(statisticsCounter.numberOfComments, 4);
        Assert.assertEquals(statisticsCounter.numberOfPosts, 1);
        Assert.assertEquals(statisticsCounter.averageCommentsPerPost, 0, 25);
        Assert.assertEquals(statisticsCounter.averageUserComments, 0, 75);
        Assert.assertEquals(statisticsCounter.averageUserPosts, 0, 33);
    }

    @Test
    public void testCalculateAdvStatistics0Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNames = new ArrayList<String>();
        userNames.add(0, "Eryk");
        userNames.add(0, "Konrad");
        userNames.add(0, "Krzysztof");
        int numberOfPosts = 0;
        int numberOfComments = 4;

        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.userNames()).thenReturn(userNames);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCounter.averageUserPosts, 0, 0);
        Assert.assertEquals(statisticsCounter.averageCommentsPerPost, 0, 0);
        Assert.assertEquals(statisticsCounter.averageUserComments, 0, 75);
    }

    @Test
    public void testCalculateAdvStatistics1000Posts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNames = new ArrayList<String>();
        userNames.add(0, "Eryk");
        userNames.add(0, "Konrad");
        userNames.add(0, "Krzysztof");
        int numberOfPosts = 1000;
        int numberOfComments = 10;

        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.userNames()).thenReturn(userNames);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCounter.averageUserPosts, 0, 003);
        Assert.assertEquals(statisticsCounter.averageCommentsPerPost, 100, 0);
        Assert.assertEquals(statisticsCounter.averageUserComments, 0, 33);
    }

    @Test
    public void testCalculateAdvStatisticsLessCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNames = new ArrayList<String>();
        userNames.add(0, "Eryk");
        userNames.add(0, "Konrad");
        userNames.add(0, "Krzysztof");
        int numberOfPosts = 100;
        int numberOfComments = 10;

        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.userNames()).thenReturn(userNames);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCounter.averageUserPosts, 0, 003);
        Assert.assertEquals(statisticsCounter.averageCommentsPerPost, 10, 0);
        Assert.assertEquals(statisticsCounter.averageUserComments, 0, 3);
    }

    @Test
    public void testCalculateAdvStatisticsMoreCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNames = new ArrayList<String>();
        userNames.add(0, "Eryk");
        userNames.add(0, "Konrad");
        userNames.add(0, "Krzysztof");
        int numberOfPosts = 10;
        int numberOfComments = 100;

        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.userNames()).thenReturn(userNames);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCounter.averageUserPosts, 0, 3);
        Assert.assertEquals(statisticsCounter.averageCommentsPerPost, 0, 1);
        Assert.assertEquals(statisticsCounter.averageUserComments, 0, 03);
    }

    @Test
    public void testCalculateAdvStatistics0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNames = new ArrayList<String>();
        int numberOfPosts = 100;
        int numberOfComments = 10;

        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.userNames()).thenReturn(userNames);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCounter.averageUserPosts, 0, 0);
        Assert.assertEquals(statisticsCounter.averageCommentsPerPost, 10, 0);
        Assert.assertEquals(statisticsCounter.averageUserComments, 0, 0);
    }

    @Test
    public void testCalculateAdvStatistics100Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        List<String> userNames = new ArrayList<String>();
        Random generator = new Random();
        int generatorValue;
        generatorValue = generator.nextInt(10);
        String randomUserName = "";
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < generatorValue; j++) {
                randomUserName = randomUserName + "a";
            }
            userNames.add(randomUserName);
        }

        int numberOfPosts = 100;
        int numberOfComments = 10;

        when(statisticsMock.commentsCount()).thenReturn(numberOfComments);
        when(statisticsMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticsMock.userNames()).thenReturn(userNames);

        StatisticsCounter statisticsCounter = new StatisticsCounter();
        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(statisticsCounter.numberOfUsers, 100);
        Assert.assertEquals(statisticsCounter.averageUserComments, 10, 0);
        Assert.assertEquals(statisticsCounter.averageUserPosts, 1, 0);
        Assert.assertEquals(statisticsCounter.averageCommentsPerPost, 10, 0);

    }
}