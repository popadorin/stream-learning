package com.dorin.learning.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Create a function that receives a list of Students, and returns the list of their names
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jora", 21, null));
        students.add(new Student("Grisha", 22, null));
        students.add(new Student("Anton", 20, null));

        List<String> names = studentNames(students);
        names.forEach(System.out::println);
    }

    private static List<String> studentNames(List<Student> students) {
        return students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
    }
}
