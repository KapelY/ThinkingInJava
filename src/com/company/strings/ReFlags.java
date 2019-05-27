package com.company.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * page 441
 */
public class ReFlags {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("^java",
                Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
        Matcher m = p.matcher(
                "java has rege\nJava has regex\n" +
                        "JAVA has pretty good regular expression\n" +
                        "Regular expression are in Java"
        );
        while (m.find())
            System.out.println(m.group());
    }
}
