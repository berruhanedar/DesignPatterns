package com.berruhanedar.Behavioral.ObjectPatterns.TemplateMethod;

import java.util.Date;

public class ScienceHighSchoolLetter extends AbsenceExcuseLetter{

    private String className;
    private String number;
    private String name;

    public ScienceHighSchoolLetter(String className, String number, String name) {
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
        return "Istanbul Science High School";
    }

    @Override
    public String getCity() {
        return "Istanbul";
    }

    @Override
    public String getClassName() {
        return "12-C";
    }

    @Override
    public String getSchoolNumber() {
        return "5678";
    }

    @Override
    public String getEducationYear() {
        return "2026";
    }

    @Override
    public String getTerm() {
        return "Spring";
    }

    @Override
    public String getStudentFullName() {
        return "Jack Carol";
    }

}
