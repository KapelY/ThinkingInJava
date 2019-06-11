package com.company.io;//: io/OSExecuteDemo.java
// Demonstrates standard I/O redirection.759

public class OSExecuteDemo {
  public static void main(String[] args) {
    MemoryInput.OSExecute.command("javap OSExecuteDemo");
  }
} /* Output:
Compiled from "OSExecuteDemo.java"
public class OSExecuteDemo extends java.lang.Object{
    public OSExecuteDemo();
    public static void main(java.lang.String[]);
}
*///:~
