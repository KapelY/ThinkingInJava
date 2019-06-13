package com.company.annotations;//: annotations/UseCase.java 851
import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
  int id();
  String description() default "no description";
} ///:~
