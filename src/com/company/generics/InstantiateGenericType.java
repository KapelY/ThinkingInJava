package com.company.generics;

/**
 * page 539
 */
class ClassAsFactory<T> {
    T x;

    public ClassAsFactory(Class<T> x) {
        try {
            this.x = x.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}

class Employee {}

public class InstantiateGenericType {
    public static void main(String[] args) {
        ClassAsFactory<Employee> fe =
                new ClassAsFactory<>(Employee.class);
        System.out.println("success");

        try {
            ClassAsFactory<Integer> fi =
                    new ClassAsFactory<>(Integer.class);
        } catch (Exception e) {
            System.out.println("fail");
        }
    }

}
