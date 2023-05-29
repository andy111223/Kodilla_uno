package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoggerTestSuite {
    private static Logger logger;
    @BeforeAll
    public static void startLogger() {
        logger = Logger.INSTANCE;
    }
    @Test
    void testGetLastLog() {
        //Given
        String logName = "Logging XYZ";
        //When
        logger.log("Logging XYZ");
        String result = logger.getLastLog();
        //Then
        assertEquals("Logging XYZ",result);
    }
}
