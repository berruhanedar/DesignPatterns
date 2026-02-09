package com.berruhanedar.Structural.Decorator;

public class LineReportDecorator extends ReportDecorator {

    public LineReportDecorator(Report report) {

        super(report);
    }

    @Override
    public String getContent() {
        String content = super.getContent();
        String lineReportContent = ReportUtil.getLineReportContent(content);
        return lineReportContent;
    }
}
