package com.dorin.learning.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Create a function that receives a list of numbers, and computes the average for just the positive ones
        List<Number> numbers = new ArrayList<>();
        numbers.add(-5);
        numbers.add(8);
        numbers.add(7);
        numbers.add(-21);

        Number average = computeAverage(numbers);
        System.out.println(average);
    }

    private static Number computeAverage(List<Number> numbers) {
        List<Number> positiveOnes = numbers.stream()
                .filter(element -> (int)element > 0)
                .collect(Collectors.toList());

        Number sum = positiveOnes.stream()
                .reduce((first, second) -> (int)first + (int)second)
                .get();

        return (double)sum.intValue() / positiveOnes.size();
    }
}
