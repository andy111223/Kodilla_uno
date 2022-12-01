package com.kodilla.exception.io;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

public class FileReaderTestSuite {

    @Test
    void testReadFile() {

        //Given
        FileReader fileReader = new FileReader();
        String fileName = "Nie_ma_takiego_pliku.txt";
        //When & Then
        assertDoesNotThrow(() -> fileReader.readFile("names.txt"));
    }

    @Test
    void whenFileDosntExistsReadFileShouldThrowException() {

        //Given
        FileReader fileReader = new FileReader();
        String fileName = "Nie_ma_takiego_pliku.txt";

        //When & Then
        assertThrows(FileReaderException.class,() -> fileReader.readFile(fileName));
    }

    @Test
    public void testReadFileWithName() {
        // given
        FileReader fileReader = new FileReader();
        // when & then
        assertAll(
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile("Nie_ma_takiego_pliku.txt")),
                () -> assertThrows(FileReaderException.class, () -> fileReader.readFile(null)),
                () -> assertDoesNotThrow(() -> fileReader.readFile("names.txt"))
        );
    }
}
