package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.*;
public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("ForumUser test Okay!");
        } else {
            System.out.println("Error");
        }
        System.out.println("Pierwszy test jednostkowy ^__^ ");

        //Zadanie moduł 6.2
        Calculator calculator = new Calculator(150, 850);

        int result1 = calculator.add();
        if (result1 == 1000) {
            System.out.println("Adding test Okay!");
        } else {
            System.out.println("Adding error");
        }
        int result2 = calculator.subtract();
        if (result2 == 700) {
            System.out.println("Subtracting test Okay!");
        } else {
            System.out.println("Subtracting error");
        }
    }
}
