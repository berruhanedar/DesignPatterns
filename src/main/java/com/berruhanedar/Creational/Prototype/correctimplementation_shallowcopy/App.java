package com.berruhanedar.Creational.Prototype.correctimplementation_shallowcopy;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        GeneralEntityService entityService = new GeneralEntityService();

        Date startTime = new Date();
        Document document = entityService.findDocumentById(1L);
        printDocumentWithElapsedTime(document, startTime);

        Date startDate1 = new Date();
        Document document1 = entityService.findDocumentById(2L);
        printDocumentWithElapsedTime(document1, startDate1);

        // Prototype Example // 0 Second because it's clone
        Date startDate2 = new Date();
        Document cloneDocument = null;
        try {
            cloneDocument = document.clone(); // shallow copy
            // Prototype example: cloning is much faster than creating a new object.
            // This is a shallow copy, so cloneDocument and document share the same references
            // for Category and DocumentType. If one of these reference objects is modified,
            // the change will affect both the original and the cloned object.
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        cloneDocument.setName("Diary");
        cloneDocument.setData("Dear Diary");
        // Shallow copy demonstration:
        // Changing the FileType of the cloned document also changes the FileType of the original document
        // because both objects share the same reference.
        cloneDocument.getFileType().setName("Private");

        printDocumentWithElapsedTime(cloneDocument, startDate2);

        printDocumentWithElapsedTime(document, startTime);

    }

    private static void printDocumentWithElapsedTime(Document document, Date startTime) {
        Date endTime = new Date();

        System.out.println(document);
        System.out.println(calculateElapsedSeconds(startTime, endTime));
        System.out.println("\n");
    }

    private static long calculateElapsedSeconds(Date startTime, Date endTime) {
        long elapsedMilliseconds = endTime.getTime() - startTime.getTime();
        return elapsedMilliseconds / 1000;
    }
}
