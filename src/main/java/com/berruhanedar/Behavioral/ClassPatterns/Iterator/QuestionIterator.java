package com.berruhanedar.Behavioral.ClassPatterns.Iterator;

import java.util.Iterator;

public class QuestionIterator implements Iterator {

    private Question[] questions;
    private int index;

    public QuestionIterator(Question[] questions) {
        this.questions = questions;
    }

    @Override
    public boolean hasNext() {
        if(index < questions.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Question question = questions[index];
        index++;
        return question;
    }
}
