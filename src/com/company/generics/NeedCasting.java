package com.company.generics;

import java.io.*;
import java.util.List;

/**
 * page 565
 */
public class NeedCasting {
    public void f(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(args[0]));
        List<Widget> shapes = (List<Widget>) in.readObject();
        List<Widget> lw2 = List.class.cast(in.readObject()); // redundant shit
    }
}
