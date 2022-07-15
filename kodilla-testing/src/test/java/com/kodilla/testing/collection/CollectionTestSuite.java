package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

//Test Suite (zbiór testów)
public class CollectionTestSuite {

    @BeforeEach
    public void before(){
        System.out.println("The Case: odd numbers exterminator test begins");
    }
    @AfterEach
    public void after() {
        System.out.println("The Case: odd numbers exterminator test ends");
    }
    @DisplayName("Checks the correct behavior of the class when the list is empty")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
        //Then
        Assertions.assertEquals(emptyList, resultList);
    }

    @DisplayName("Checks the correct behavior of the class when the list contains even and odd numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        List<Integer> normalList = new ArrayList<>();
        List<Integer> expectedResultList = new ArrayList<>();
        normalList.add(1);
        normalList.add(2);
        expectedResultList.add(4);
        expectedResultList.add(6);
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(normalList);
        //Then
        Assertions.assertEquals(expectedResultList, resultList);
    }
}
