package com.company.Containers;//: containers/Prediction.java
// Predicting the weather with groundhogs. 675

import java.util.Random;

public class Prediction {
  private static Random rand = new Random(47);
  private boolean shadow = rand.nextDouble() > 0.5;
  public String toString() {
    if(shadow)
      return "Six more weeks of Winter!";
    else
      return "Early Spring!";
  }
} ///:~
