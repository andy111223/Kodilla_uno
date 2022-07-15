package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> oddNumbersList = new ArrayList<>();
        for (int number: numbers) {
            if(number % 0 == 0) {
                oddNumbersList.add(number);
            }
        }
        return oddNumbersList;
    }
}
