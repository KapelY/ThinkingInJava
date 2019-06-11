package com.company.io;//: io/MemoryInput.java 745

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class MemoryInput {
    public static void main(String[] args) throws IOException {
        StringReader in = new StringReader(
                BufferedInputFile.read("src/com/company/io/MemoryInput.java"));
        int c;
        while ((c = in.read()) != -1)
            System.out.print((char) c);
    }

    public static class OSExecute {
        public static void command(String command) {
            boolean err = false;
            try {
                Process process =
                        new ProcessBuilder(command.split(" ")).start();
                BufferedReader results = new BufferedReader(
                        new InputStreamReader(process.getInputStream()));
                String s;
                while ((s = results.readLine()) != null)
                    System.out.println(s);
                BufferedReader errors = new BufferedReader(
                        new InputStreamReader(process.getErrorStream()));
                // Report errors and return nonzero value
                // to calling process if there are problems:
                while ((s = errors.readLine()) != null) {
                    System.err.println(s);
                    err = true;
                }
            } catch (Exception e) {
                // Compensate for Windows 2000, which throws an
                // exception for the default command line:
                if (!command.startsWith("CMD /C"))
                    command("CMD /C " + command);
                else
                    throw new RuntimeException(e);
            }
            if (err)
                throw new OSExecuteException("Errors executing " +
                        command);
        }
    } ///:~

    public static class OSExecuteException extends RuntimeException {
      public OSExecuteException(String why) { super(why); }
    } ///:~
} /* (Execute to see output) *///:~
