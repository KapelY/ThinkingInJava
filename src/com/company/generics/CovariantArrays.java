package com.company.generics;

/**
 * page 549
 */
class Fruit {}
class Apple extends Fruit {}
class Jonathan extends Apple {}
class Orange extends Fruit {}

public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruits = new Apple[10];
        fruits[0] = new Apple();
        fruits[1] = new Jonathan();
        fruits[1] = new Apple();
//        fruits[2] = new Orange();
        try {
            fruits[0] = new Fruit();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            fruits[0] = new Orange();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
