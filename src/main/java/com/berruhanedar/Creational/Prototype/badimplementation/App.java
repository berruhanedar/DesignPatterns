package com.berruhanedar.Creational.Prototype.badimplementation;

import java.util.Date;

// This is a bad example because each object is created separately,
// and the creation of a single document takes about 4 seconds.
// When many similar objects are needed, this approach causes serious performance problems.
// In such cases, the Prototype Pattern should be used to clone existing objects instead of creating new ones from scratch.
public class App {
    public static void main(String[] args) {
        GeneralEntityService entityService = new GeneralEntityService();

        Date startTime = new Date();
        Document document = entityService.findDocumentById(1L);
        Date endTime = new Date();

        System.out.println(document);
        System.out.println(calculateElapsedSeconds(startTime, endTime));

        Date startDate1 = new Date();
        Document document1 = entityService.findDocumentById(2L);
        Date endDate1 = new Date();

        System.out.println(document1);
        System.out.println(calculateElapsedSeconds(startDate1, endDate1));
    }

    private static long calculateElapsedSeconds(Date startTime, Date endTime) {
        long elapsedMilliseconds = endTime.getTime() - startTime.getTime();
        return elapsedMilliseconds / 1000;
    }
}
