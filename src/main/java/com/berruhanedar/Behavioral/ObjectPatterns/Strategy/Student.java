package com.berruhanedar.Behavioral.ObjectPatterns.Strategy;

public class Student {

    private DepartmentType department;
    private ExamStrategy examStrategy;

    public Student(DepartmentType department) {
        this.department = department;

        if (department == null) {
            throw new NullPointerException("Department cannot be null");
        }

        switch (department) {
            case VERBAL:
                examStrategy = new VerbalStrategy();
                break;
            case BALANCED:
                examStrategy = new BalancedStrategy();
                break;
            case QUANTITATIVE:
                examStrategy = new QuantitativeStrategy();
                break;
            default:
                throw new IllegalArgumentException("Department type cannot be null");
        }
    }

    public String printExamSequence() {
        System.out.println("Strategy for: " + department);
        String sequence = "Firstly do it : " + examStrategy.getFirstLesson() +
                "\nSecondly do it : " + examStrategy.getSecondLesson() +
                "\nSThirdly do it : " + examStrategy.getThirdLesson() +
                "\nSFourthly do it : " + examStrategy.getFourthLesson();
        return sequence;
    }
}
