package com.company.concurrency;//: concurrency/SerialNumberGenerator.java 931

public class SerialNumberGenerator {
  private static int serialNumber = 0;
  public static synchronized int nextSerialNumber() {
    return serialNumber++; // Not thread-safe
  }
} ///:~
