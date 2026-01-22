package com.berruhanedar.Behavioral.ObjectPatterns.TemplateMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class AbsenceExcuseLetter {

    public void printLetter() {
        System.out.println(letterContent());
    }

    private String letterContent() {

        StringBuilder letter = new StringBuilder();

        String formattedDate = getFormattedDate();

        letter.append("**************************************************************************\n");
        letter.append("\t\t\t\t\t\t\t\t\t\t\t\t\t\t")
                .append(formattedDate).append("\n");

        letter.append("\t\t\t\t")
                .append(getInstitutionName())
                .append(" Directorate\n");

        letter.append("\t\t\t\t\t\t\t\t\t\t\t\t")
                .append(getCity()).append("\n\n");

        letter.append("\t")
                .append("I am currently studying as a student with school number ")
                .append(getSchoolNumber())
                .append(" in class ")
                .append(getClassName())
                .append(" at your institution.\n");

        letter.append(getEducationYear())
                .append(" academic year ")
                .append(getTerm())
                .append(" term, I kindly request that my absenteeism status be notified to me.\n");

        letter.append("Yours sincerely.\n\n");

        letter.append("\t\t\t\t\t\t\t\t\t\t\t\t")
                .append(getStudentFullName()).append("\n");

        letter.append("**************************************************************************");

        return letter.toString();
    }

    private String getFormattedDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        return format.format(getDate());
    }

    public abstract Date getDate();
    public abstract String getInstitutionName();
    public abstract String getCity();
    public abstract String getClassName();
    public abstract String getSchoolNumber();
    public abstract String getEducationYear();
    public abstract String getTerm();
    public abstract String getStudentFullName();



}
