package com.kodilla.exception.test;

import java.sql.SQLOutput;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {

            try {
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            System.out.println("Nie dziel ch*ler* przez zero");
            } finally {
                System.out.println("Wolno dzielić przez liczby inne niż zero");
            }
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3,0);

        System.out.println(result);
    }
}
