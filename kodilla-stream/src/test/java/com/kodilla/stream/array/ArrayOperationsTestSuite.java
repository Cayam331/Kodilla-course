package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        //Given
        int[] array1 = new int[5];
        array1[0] = 2;
        array1[1] = 4;
        array1[2] = 3;
        array1[3] = 5;
        array1[4] = 2;

        //When
        double result = ArrayOperations.getAverage(array1);

        //Then
        Assert.assertEquals(3.2, result, 0);
    }
}
