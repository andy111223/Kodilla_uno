package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {

        //Given
        int[] array1 = new int[]{1, 2, 3};
        double expectedAverage = 2;


        //When
        double result = ArrayOperations.getAverage(array1);

        //Then
        assertEquals(expectedAverage, result, 1);
    }
}
