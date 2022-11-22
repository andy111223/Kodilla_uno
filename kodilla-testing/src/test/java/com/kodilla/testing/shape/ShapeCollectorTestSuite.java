package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

@DisplayName("TDD: Forum Test Suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }
    @AfterAll
    public static void afterAllTests() {
        System.out.println("All tests are finished");
    }
    @BeforeEach
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execture test #" + testCounter);
    }
    @Nested
    @DisplayName("Tests for adding and removing figures")
    class TestAddingAndRemovingFigures {

        @Test
        void testAddFigure() {
            //Given
            //When
            //Then
        }
        @Test
        void testRemoveFigure() {
            //Given
            //When
            //Then
        }
    }
    @Nested
    @DisplayName("Tests for getting a given figure and showing all figures")
    class TestGettingAFigureAndShowingAllFigures {
        @Test
        void testGetFigure() {
            //Given
            //When
            //Then
        }
        @Test
        void testShowFigures() {
            //Given
            //When
            //Then
        }
    }
}
