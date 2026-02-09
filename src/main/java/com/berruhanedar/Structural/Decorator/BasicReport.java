package com.berruhanedar.Structural.Decorator;

public class BasicReport implements Report {

    private String content;

    public BasicReport(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
