package com.berruhanedar.Structural.Decorator;

public class ReportApp {
    public static void main(String[] args) {
        String content = getReportContent();
        // Basic Report (no decorator)
        // Report report = createBasicReport(content);

        // Line Report (adds lines)
        // Report report = createLineReport(content);

        // Small Report (limits width)
        // Report report = createSmallReport(content);

        // Line + Small Report
        // Report report = createLineAndSmallReport(content);

        // Signature Report
        // Report report = createSignatureReport(content);

        // Small + Line + Signature Report (FULL DECORATOR CHAIN ⭐)
        Report report = createSignedLineSmallReport(content);

        System.out.println(report.getContent());
    }

    // ✅ Basic Report
    private static Report createBasicReport(String content) {
        return new BasicReport(content);
    }

    // ✅ Line Report
    private static Report createLineReport(String content) {
        Report report = createBasicReport(content);
        return new LineReportDecorator(report);
    }

    // ✅ Line + Small Report
    private static Report createLineAndSmallReport(String content) {
        Report report = createBasicReport(content);
        report = new LineReportDecorator(report);
        report = new SmallReportDecorator(report);
        return report;
    }

    // ✅ Signed + Line + Small Report (FINAL DECORATOR CHAIN )
    private static Report createSignedLineSmallReport(String content) {
        Report report = createBasicReport(content);
        report = new SmallReportDecorator(report);
        report = new LineReportDecorator(report);
        report = new SignatureReportDecorator(report);
        return report;
    }

    // ✅ Report Content
    private static String getReportContent() {
        return """
                Report Summary

                Lorem Ipsum is simply dummy text of the printing and typesetting industry.
                It has been used as placeholder text for many years.
                This report demonstrates the Decorator Pattern example.
                """;
    }
}