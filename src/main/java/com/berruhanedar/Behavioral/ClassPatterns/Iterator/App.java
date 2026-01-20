package com.berruhanedar.Behavioral.ClassPatterns.Iterator;

import java.util.Iterator;

public class App {
    public static void main(String[] args) {
        Book book = new Book("Math");
        Booklet booklet = new Booklet("Math");

        Iterator questionIteratorBook = book.getQuestionIteraion();
        Iterator questionIteratorBooklet = booklet.getQuestionIterator();

        print(questionIteratorBook);
        print(questionIteratorBooklet);

    }

    private static void print(Iterator questionIteratorBook) {
        while (questionIteratorBook.hasNext()) {
            Question question = (Question) questionIteratorBook.next();
            Long questionNo = question.getQuestionNumber();
            System.out.println("Question No: " + questionNo);
        }
    }
}
