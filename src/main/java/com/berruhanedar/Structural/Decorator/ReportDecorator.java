package com.berruhanedar.Structural.Decorator;

public abstract class ReportDecorator implements Report {
    private Report report;

    public ReportDecorator(Report report) {
        this.report = report;
    }

    @Override
    public String getContent() {
        return report.getContent();
    }

}
