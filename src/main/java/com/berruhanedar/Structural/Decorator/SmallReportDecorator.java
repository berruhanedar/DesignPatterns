package com.berruhanedar.Structural.Decorator;

public class SmallReportDecorator extends ReportDecorator {

    private int width;

    public SmallReportDecorator(Report report) {
        super(report);
        this.width = 30;
    }

    @Override
    public String getContent() {
        String content = super.getContent();
        String smallText = ReportUtil.fitText(content, width);
        return smallText;
    }
}
