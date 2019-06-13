//: enumerated/Competitor.java
// Switching one enum on another.
package com.company.enumerater;

public interface Competitor<T extends Competitor<T>> {
  Outcome compete(T competitor);
} ///:~
