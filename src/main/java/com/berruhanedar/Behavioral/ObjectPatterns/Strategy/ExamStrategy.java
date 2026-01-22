package com.berruhanedar.Behavioral.ObjectPatterns.Strategy;

public interface ExamStrategy {
    LessonType getFirstLesson();
    LessonType getSecondLesson();
    LessonType getThirdLesson();
    LessonType getFourthLesson();
}
