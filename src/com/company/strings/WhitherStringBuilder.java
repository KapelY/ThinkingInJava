package com.company.strings;

public class WhitherStringBuilder {
    public String implicit(String[] fields) {
        String results = "";
        for (int i = 0; i < fields.length; i++) {
            results += fields[i];
        }
        return results;
    }
    public String explicit(String[] fields) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            result.append(fields[i]);
        }
        return result.toString();
    }
}
