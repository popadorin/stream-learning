package com.dorin.learning.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        // Create a function that receives a list of numbers, and computes the average for just the positive ones
        List<Number> numbers = new ArrayList<>();
        numbers.add(-5);
        numbers.add(8);
        numbers.add(7);
        numbers.add(-21);
        numbers.add(15);

        OptionalDouble average = computeAverage(numbers);
        if (!average.isPresent()) {
            System.out.println("Some problems in the computeAverage method");
        } else {
            System.out.println(average.getAsDouble());
        }
    }

    private static OptionalDouble computeAverage(List<Number> numbers) {
        OptionalDouble average = numbers.stream()
                .filter(number -> (int)number > 0)
                .mapToInt(a -> (int)a)
                .average();

        return average;
    }
}
