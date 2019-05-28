package com.company.strings;

import com.company.io.TextFile;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * page 446
 * {Args: JGrep.java "/b[Ssct]/w++"}
 */
public class JGrep {
    public static void main(String[] args) throws URISyntaxException, IOException {
        if (args.length < 2) {
            System.out.println("Usage: java JGrep file regex");
            System.exit(0);
        }
        String regex = args[1];
        Pattern p = Pattern.compile(regex);
        int index = 0;
        Matcher m = p.matcher("");
        for (String line : new TextFile("src//com//company//strings//" + args[0])) {
            m.reset(line);
            while (m.find()) {
                System.out.println(index++ + ": " +
                        m.group() + ": " + m.start());
            }
        }
    }
}
