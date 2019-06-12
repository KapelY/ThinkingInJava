package com.company.io;//: io/Blip3.java
// Reconstructing an externalizable object. 794

import java.io.*;

import static com.company.net.mindview.util.Print.print;

public class Blip3 implements Externalizable {
    private int i;
    private String s; // No initialization

    public Blip3() {
        print("Blip3 Constructor");
        // s, i not initialized
    }

    public Blip3(String x, int a) {
        print("Blip3(String x, int a)");
        s = x;
        i = a;
        // s & i initialized only in non-default constructor.
    }

    public String toString() {
        return s + i;
    }

    public void writeExternal(ObjectOutput out)
            throws IOException {
        print("Blip3.writeExternal");
        // You must do this:
        out.writeObject(s);
        out.writeInt(i);
        System.out.println(this);
    }

    public void readExternal(ObjectInput in)
            throws IOException, ClassNotFoundException {
        print("Blip3.readExternal");
        // You must do this:
        s = (String) in.readObject();
        i = in.readInt();
    }

    public static void main(String[] args)
            throws IOException, ClassNotFoundException {
        print("Constructing objects:");
        Blip3 b3 = new Blip3("A String ", 47);
        Blip3 b4 = new Blip3();
        print(b3);
        System.out.println(b4);
        System.out.println();

        ObjectOutputStream o = new ObjectOutputStream(
                new FileOutputStream("Blip3.out"));
        print("Saving object:");
        o.writeObject(b3);
        o.writeObject(b4);
        o.close();
        System.out.println();

        // Now get it back:
        ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("Blip3.out"));
        print("Recovering b3:");
        b3 = (Blip3) in.readObject();
        b4 = (Blip3) in.readObject();
        print(b3);
        System.out.println(b4);
    }
} /* Output:
Constructing objects:
Blip3(String x, int a)
A String 47
Saving object:
Blip3.writeExternal
Recovering b3:
Blip3 Constructor
Blip3.readExternal
A String 47
*///:~
