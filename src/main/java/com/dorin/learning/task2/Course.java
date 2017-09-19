package com.dorin.learning.task2;

public class Course {
    private String title;
    private Integer duration;
    private Double score;

    public Course(String title, Integer duration, Double score) {
        this.title = title;
        this.duration = duration;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Course{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                ", score=" + score +
                '}';
    }
}
