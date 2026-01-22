package com.berruhanedar.Behavioral.ObjectPatterns.Strategy;

public enum DepartmentType {
    VERBAL("Verbal"),
    BALANCED("Balanced"),
    QUANTITATIVE("Quantitative");

    private final String department;

    DepartmentType(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return department;
    }
}
