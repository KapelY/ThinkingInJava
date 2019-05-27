package com.company.strings;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * page 444
 */
/*! Here's a block of text to use as input to
    the regular expression matcher. Note that we'll
    first extract the    block of text by looking for
    the special delimiters, then process the
    extracted block.
 !*/
public class TheReplacements {
    public static void main(String[] args) throws IOException {
        String s = new String(Files.readAllBytes(Paths.get("src//com//company//strings//TheReplacements.java")));
        Matcher mInput = Pattern.compile("(?s)/\\*!(.*)!\\*/").matcher(s);
        if (mInput.find())
            s = mInput.group(1);
        s = s.replaceAll(" {2,}", " ");
        System.out.println(s);
        s = s.replaceAll("(?m)^ +", "");
        System.out.println(s);
        s.replaceFirst("[aeiou]", "(VOWEL1");
        StringBuffer sbuf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);
        while (m.find()) {
            m.appendReplacement(sbuf, m.group().toUpperCase());
//            System.out.println(m.group().toUpperCase()); //Awesome replacement FEATURE
        }
        m.appendTail(sbuf);
        System.out.println(sbuf);
    }
}
