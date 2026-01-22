package com.berruhanedar.Behavioral.ObjectPatterns.Strategy;

public enum LessonType {

    TURKISH("Turkish"),
    MATHEMATICS("Mathematics"),
    SCIENCE("Science"),
    SOCIAL("Social Studies");

    private final String lesson;

    LessonType(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return lesson;
    }
}
