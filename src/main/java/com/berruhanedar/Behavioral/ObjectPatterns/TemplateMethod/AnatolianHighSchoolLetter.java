package com.berruhanedar.Behavioral.ObjectPatterns.TemplateMethod;

import java.util.Date;

public class AnatolianHighSchoolLetter extends AbsenceExcuseLetter {

    private String className;
    private String number;
    private String name;

    public AnatolianHighSchoolLetter(String className, String number, String name) {
        this.className = className;
        this.number = number;
        this.name = name;
    }

    @Override
    public Date getDate() {
        return new Date();
    }

    @Override
    public String getInstitutionName() {
        return "Istanbul Anatolian High School";
    }

    @Override
    public String getCity() {
        return "Istanbul";
    }

    @Override
    public String getClassName() {
        return "12-A";
    }

    @Override
    public String getSchoolNumber() {
        return "1234";
    }

    @Override
    public String getEducationYear() {
        return "2026";
    }

    @Override
    public String getTerm() {
        return "Fall";
    }

    @Override
    public String getStudentFullName() {
        return "John Doe";
    }
}
