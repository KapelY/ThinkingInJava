package com.company.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

import static java.lang.String.valueOf;

/**
 * page 752
 */
public class TextFile extends ArrayList<String> {
    public static String read(String fileName) {
        StringBuffer sb = new StringBuffer();
        try (BufferedReader in = new BufferedReader(new FileReader(
                new File(valueOf(fileName)).getAbsoluteFile()));) {
            System.out.println(new File(valueOf(fileName)).getAbsoluteFile());
            String s;
            while ((s = in.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
    public static void write(String fileName, String text) {
        try (PrintWriter out = new PrintWriter(
                new File(fileName).getAbsoluteFile()
        )) {
            out.print(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public TextFile(String fileName, String splitter) {
        super(Arrays.asList(read(fileName).split(splitter)));
        if (get(0).equals("")) remove(0); // if splitter leaves an empty string first
    }

    public TextFile(String fileName) {
        this(fileName, "\n");
    }
    public void write(String fileName) {
        try (PrintWriter out = new PrintWriter(new File(fileName).getAbsoluteFile())) {
            for (String item: this) {
                out.print(item);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String dirName = "src//com//company//io//";
        String text = read(dirName + "TextFile.java");
        write("test.txt", text);
        TextFile textFile = new TextFile("test.txt");
        textFile.write("test2.txt");
        TreeSet<String> words = new TreeSet<>(new TextFile(dirName +"TextFile.java", "\\W+"));
        System.out.println(words.headSet("a"));

    }
}
