package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {
    @BeforeClass
    public static void log() {
        Logger.getLoggerInstance().log("test");
    }

    @Test
    public void testGetLastLog() {
        //Given

        //When
        String result = Logger.getLoggerInstance().getLastLog();
        //Then
        Assert.assertEquals("test", result);
    }

}
