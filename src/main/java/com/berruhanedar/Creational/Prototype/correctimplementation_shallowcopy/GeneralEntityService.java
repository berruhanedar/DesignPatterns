package com.berruhanedar.Creational.Prototype.correctimplementation_shallowcopy;

public class GeneralEntityService {
    public DocumentType findDocumentType(Long id) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        DocumentType documentType = new DocumentType();
        documentType.setId(id);

        String name;
        if (id.compareTo(1L) == 0) {
            name = "Personal";
        } else if (id.compareTo(2L) == 0) {
            name = "Official";
        } else {
            name = "General";
        }

        documentType.setName(name);
        return documentType;
    }

    public Category findCategoryById(Long id) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Category category = new Category();
        category.setId(id);

        String name;
        if (id.compareTo(1L) == 0) {
            name = "Private";
        } else if (id.compareTo(2L) == 0) {
            name = "Business";
        } else {
            name = "General";
        }

        category.setName(name);
        return category;
    }

    public Document findDocumentById(Long id) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Document document = new Document();
        document.setId(id);
        document.setDocumentType(findDocumentType(id));
        document.setCategory(findCategoryById(id));

        String name;
        String data;
        if (id.compareTo(1L) == 0) {
            name = "Letter";
            data = "Dear Friend Berru, ....";
        } else if (id.compareTo(2L) == 0) {
            name = "Report";
            data = "This report was prepared to be sent to the CEO.";
        } else {
            name = "Traffic Rules";
            data = "Give way to pedestrians when you turn right.";
        }
        document.setName(name);
        document.setData(data);
        return document;
    }
}
