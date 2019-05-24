package com.company.exceptions;

public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("My Exception");
        } catch (Exception e) {
            System.out.println("e.printStackTrace: ");e.printStackTrace();
            System.out.println("e.getMessage(): " + e.getMessage());
            System.out.println("getLocalizedMessage: " + e.getLocalizedMessage());
            System.out.println("toString: " + e);
        }
    }
}
