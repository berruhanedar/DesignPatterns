package com.berruhanedar.Behavioral.ObjectPatterns.Strategy;

public class BalancedStrategy implements  ExamStrategy {
    @Override
    public LessonType getFirstLesson() {
        return LessonType.TURKISH;
    }

    @Override
    public LessonType getSecondLesson() {
        return LessonType.MATHEMATICS;
    }

    @Override
    public LessonType getThirdLesson() {
        return LessonType.SOCIAL;
    }

    @Override
    public LessonType getFourthLesson() {
        return LessonType.SCIENCE;
    }
}
