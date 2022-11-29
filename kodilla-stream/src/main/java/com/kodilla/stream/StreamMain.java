package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

//        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//
//        System.out.println("Calculating expressions with lambdas:");
//
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//
//        System.out.println("Calculating expressions with method references:");
//
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//
//        PoemBeautifier poemBeautifier = new PoemBeautifier();
//
//        poemBeautifier.beautify("ABC", (textToDecorate -> textToDecorate + "CCC"));
//
//        System.out.print("Using Stream to generate even numbers from 1 to 20:");
//        NumbersGenerator.generateEven(20);
//
//        People.getList().stream()
//                .map(s -> s.toUpperCase())
//                .map(s -> s.toLowerCase())
//                .map(String::toUpperCase)
//                .filter(s -> s.length() > 11)
//                .map(s -> s.substring(0, s.indexOf(' ')+2) + ".")
////                .map(s -> s.substring(0, 1) + "." + s.substring(s.indexOf(' '), s.indexOf(' ')+2) + ".")
//                .filter(s -> s.substring(0,1).equals("M"))
//                .forEach(System.out::println);


//        BookDirectory theBookDirectory = new BookDirectory();
//        List<Book> theResultListOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toList());
//
//        System.out.println("# elements: " + theResultListOfBooks.size());
//        theResultListOfBooks.stream()
//                .forEach(System.out::println);

//        BookDirectory theBookDirectory = new BookDirectory();
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .collect(Collectors.toMap(Book::getSignature, book -> book));
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())
//                .forEach(System.out::println);

//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n", "<<", ">>"));
//
//        System.out.println(theResultMapOfBooks);

//        Forum theForum = new Forum();
//        theForum.getUserList().stream()
//                .filter(forumUser -> forumUser.getSex() == 'M')
//                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears() >= 20)
//                .filter(forumUser -> forumUser.getNumberOfPosts() > 0)
//                .forEach(System.out::println);

        Forum theForum = new Forum();
        Map<Integer, ForumUser> theMapOfForumUsers = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getNumberOfPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getId, forumUser -> forumUser));

        System.out.println("# elements: " + theMapOfForumUsers.size());
        theMapOfForumUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
