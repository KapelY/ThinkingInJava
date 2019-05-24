package com.company.exceptions;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * page 409
 */
public class MainException {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("MainException1.java");
        file.close();
    }
}
