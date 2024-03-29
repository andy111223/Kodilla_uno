package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclassifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclassifier.libraryb.BookSignature;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        if (bookSet.size() == 0) return 0;
        Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> books =
                bookSet.stream().collect(Collectors.toMap(
                        book -> new BookSignature(book.getSignature()),
                        book -> new com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book(
                                book.getAuthor(),
                                book.getTitle(),
                                book.getPublicationYear()
                        )
                ));
        return medianPublicationYear(books);
    }
}

