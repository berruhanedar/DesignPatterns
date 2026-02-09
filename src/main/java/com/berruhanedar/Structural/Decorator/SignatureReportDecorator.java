package com.berruhanedar.Structural.Decorator;

public class SignatureReportDecorator extends ReportDecorator {

    public SignatureReportDecorator(Report report) {
        super(report);
    }

    @Override
    public String getContent() {
        String content = super.getContent();
        String signatureContent = ReportUtil.addSignatureToEnd(content);
        return signatureContent;
    }
}
