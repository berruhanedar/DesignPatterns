package com.berruhanedar.Behavioral.ObjectPatterns.Strategy;

public class VerbalStrategy implements ExamStrategy
{
    @Override
    public LessonType getFirstLesson() {
        return LessonType.TURKISH;
    }

    @Override
    public LessonType getSecondLesson() {
        return LessonType.SOCIAL;
    }

    @Override
    public LessonType getThirdLesson() {
        return LessonType.MATHEMATICS;
    }

    @Override
    public LessonType getFourthLesson() {
        return LessonType.SCIENCE;
    }
}
