package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {
    @Test
    void testGetBooks() {
        //Given
        //Creating books for library
        Library library = new Library("Sleepy Paradise Library");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book(("Title " + n),("Author " + n),(LocalDate.of(2010 - n,1+n,25-n)))));

        //Making a shallow copy of the library object
        Library clonedLibrary = null;
        try{
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Xeroxed library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //Making a deep copy of the library object
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Deep Xeroxed Library");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        //When
        Iterator<Book> iterator = library.getBooks().iterator();
        if (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }

        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);

        assertEquals(9, library.getBooks().size());
        assertEquals(9, clonedLibrary.getBooks().size());
        assertEquals(10, deepClonedLibrary.getBooks().size());
        assertEquals(library.getBooks(),clonedLibrary.getBooks());
        assertNotEquals(deepClonedLibrary.getBooks(),library.getBooks());
    }
}
