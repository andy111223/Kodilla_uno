package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

import java.util.List;

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
        System.out.println("Preparing to exectute test #" + testCounter);
    }
    @Nested
    @DisplayName("Tests for adding and removing figures")
    class TestAddingAndRemovingFigures {

        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Circle(25);
            //When
            shapeCollector.addFigure(shape);
            //Then
            Assertions.assertEquals(1, shapeCollector.shapeCollection.size());
        }
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Square(25);
            shapeCollector.addFigure(shape);
            //When
            boolean result = shapeCollector.removeFigure(shape);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeCollector.shapeCollection.size());
        }
    }
    @Nested
    @DisplayName("Tests for getting a given figure and showing all figures")
    class TestGettingAFigureAndShowingAllFigures {
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(30, 20);
            shapeCollector.addFigure(shape);
            //When
            Shape retrievedFigure = shapeCollector.getFigure(0);
            //Then
            Assertions.assertEquals(shape, retrievedFigure);
        }
        @Test
        void testGetFigureNegativeIndex() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(30, 20);
            shapeCollector.addFigure(shape);
            //When
            Shape retrievedFigure = shapeCollector.getFigure(-1);
            //Then
            Assertions.assertNull(retrievedFigure);
        }
        @Test
        void testGetFigureNotExistingIndex() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape = new Triangle(30, 20);
            shapeCollector.addFigure(shape);
            //When
            Shape retrievedFigure = shapeCollector.getFigure(6);
            //Then
            Assertions.assertNull(retrievedFigure);
        }
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape shape1 = new Circle(25);
            shapeCollector.addFigure(shape1);
            Shape shape2 = new Square(25);
            shapeCollector.addFigure(shape2);
            Shape shape3 = new Triangle(30, 20);
            shapeCollector.addFigure(shape3);
            String listOfFigures = shapeCollector.shapeCollection.toString();
            //When
            String showFigures = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals(listOfFigures, showFigures);

        }

    }
}
