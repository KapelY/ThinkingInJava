//: annotations/database/Uniqueness.java
// Sample of nested annotations 856
package com.company.annotations.database;

public @interface Uniqueness {
  Constraints constraints() default @Constraints(unique=true);
} ///:~
