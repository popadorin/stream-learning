package com.dorin.learning.task2;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // 1. Create a function that receives a list of Students, and returns the list of their names
        // 2. Create a function that finds the maximum age form a list of students
        // 3. Create a function that prints out all the courses taken by a list of students, without duplicates
        // 4. Create a function that computes the average score for each student in a list
        // 5. Create a function that returns a Map of: student name <-> list of course titles, from a list of students
        // 6. Filter out the students that have taken less than 2 courses, and sort them by the number of courses taken

        List<Course> courses1 = new ArrayList<>();
        courses1.add(new Course("Maths", 120, 8.0));
        courses1.add(new Course("Chemistry", 120, 8.0));
        courses1.add(new Course("Informatics", 120, 6.0));

        List<Course> courses2 = new ArrayList<>();
        courses2.add(new Course("Maths", 120, 10.0));
        courses2.add(new Course("Geography", 120, 8.0));
        courses2.add(new Course("Physical education", 120, 7.0));

        List<Course> courses3 = new ArrayList<>();
        courses3.add(new Course("Maths", 120, 10.0));
        courses3.add(new Course("Psychology", 120, 8.0));
        courses3.add(new Course("Geography", 120, 9.0));

        List<Student> students = new ArrayList<>();
        students.add(new Student("Jora", 21, courses1));
        students.add(new Student("Grisha", 22, courses2));
        students.add(new Student("Anton", 20, courses3));

        List<String> names = studentNames(students);
        names.forEach(System.out::println);

        OptionalInt getMaximumAge = getMaximumAge(students);
        System.out.println(getMaximumAge);

        List<Course> courses = getCourses(students);
        courses.forEach(System.out::println);

        System.out.println("_____________________________");
        List<String> ll = new ArrayList<>();
        List<String> mylist = new ArrayList<>();
        mylist.add("Jora");
        mylist.add("Ghena");
        for (String element : mylist) {

        }
    }

    private static List<String> studentNames(List<Student> students) {
        return students.stream()
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    private static OptionalInt getMaximumAge(List<Student> students) {
        return students.stream().mapToInt(Student::getAge).max();
    }

    private static List<Course> getCourses(List<Student> students) {
        List<Course> courses = new ArrayList<>();
        for (Student student : students) {
            List<Course> coursesTemp = student.getCourses();
            for (Course course : coursesTemp) {
                courses.add(course);
            }
        }



        Stream<List<Course>> listStream = students.stream()
                .map(student -> student.getCourses());

        System.out.println("................................");
        listStream.forEach(System.out::println);
        System.out.println("................................");



        Set<Course> uniqueCourses = new HashSet<>(courses);
        List<Course> allCourses = new ArrayList<>(uniqueCourses);

        return allCourses;
    }
}
