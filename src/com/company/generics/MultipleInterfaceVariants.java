package com.company.generics;

/**
 * page 564
 */
interface Payable<T> {}

class Employee1 implements Payable<Employee1> {}
//class Hourly extends Employee1 implements Payable<Hourly> {}
class Hourly extends Employee1 {}

public class MultipleInterfaceVariants {
    public static void main(String[] args) {

    }
}
