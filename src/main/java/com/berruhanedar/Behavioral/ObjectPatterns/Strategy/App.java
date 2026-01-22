package com.berruhanedar.Behavioral.ObjectPatterns.Strategy;

public class App {
    public static void main(String[] args) {
        Student quantativeStudent = new Student(DepartmentType.QUANTITATIVE);
        String sequence = quantativeStudent.printExamSequence();
        System.out.println(sequence);
    }
}
