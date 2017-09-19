package com.dorin.learning.task2;

import java.util.List;

public class Student {
    private String name;
    private Integer age;
    private List<Course> courses;

    public Student(String name, Integer age, List<Course> courses) {
        this.name = name;
        this.age = age;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<Course> getCourses() {
        return courses;
    }
}
