package com.berruhanedar.Structural.Decorator;

import java.util.ArrayList;
import java.util.List;

public class ReportUtil {

    public static String getLineReportContent(String content) {
        String[] rows = content.split("\n");
        StringBuilder lineReportContent = new StringBuilder();

        for (String row : rows) {
            lineReportContent.append(addLineBeforeLine(row)).append("\n");
        }

        return lineReportContent.toString();
    }

    private static String addLineBeforeLine(String row) {
        if (row.trim().isEmpty()) {
            return "";
        }
        return "----------------\n" + row;
    }

    public static String fitText(String text, int width) {

        StringBuilder formattedText = new StringBuilder();
        String[] lines = text.split("\n");

        for (String line : lines) {

            if (line.length() <= width) {
                formattedText = appendLine(formattedText, line);
            } else {
                List<String> splittedLines = splitLine(line, width);

                for (String newLine : splittedLines) {
                    formattedText = appendLine(formattedText, newLine);
                }
            }
        }

        return formattedText.toString();
    }

    private static StringBuilder appendLine(StringBuilder mainText, String addedText) {
        return mainText.append(addedText).append("\n");
    }

    private static List<String> splitLine(String line, int width) {

        List<String> splittedLines = new ArrayList<>();

        for (int i = 0; i <= line.length() / width; i++) {

            int startIndex = width * i;
            int endIndex = startIndex + width;

            if (endIndex > line.length()) {
                endIndex = line.length();
            }

            String part = line.substring(startIndex, endIndex);

            if (part.trim().length() > 0) {
                splittedLines.add(part);
            }
        }

        return splittedLines;
    }

    public static String addSignatureToEnd(String text) {

        String signature = "\n\n + \t\t\t\t\t\t Signature: ";

        return text + signature;
    }
}
