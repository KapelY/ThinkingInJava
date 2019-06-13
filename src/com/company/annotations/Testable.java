//: annotations/Testable.java 850
package com.company.annotations;


import com.company.net.mindview.atunit.Test;

public class Testable {
  public void execute() {
    System.out.println("Executing..");
  }
  @Test
  public void testExecute() { execute(); }
} ///:~
