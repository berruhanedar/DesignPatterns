package com.berruhanedar.Behavioral.ObjectPatterns.Strategy;

public class QuantitativeStrategy implements ExamStrategy{
    @Override
    public LessonType getFirstLesson() {
        return LessonType.MATHEMATICS;
    }

    @Override
    public LessonType getSecondLesson() {
        return LessonType.SCIENCE;
    }

    @Override
    public LessonType getThirdLesson() {
        return LessonType.TURKISH;
    }

    @Override
    public LessonType getFourthLesson() {
        return LessonType.SOCIAL;
    }
}
