package com.company.Containers;//: containers/Lists.java
// Things you can do with Lists. 657

import com.company.net.mindview.util.Countries;

import java.util.*;

import static com.company.net.mindview.util.Print.print;
import static com.company.net.mindview.util.Print.printnb;

public class Lists {
  private static boolean b;
  private static String s;
  private static int i;
  private static Iterator<String> it;
  private static ListIterator<String> lit;
  public static void basicTest(List<String> a) {
    a.add(1, "x"); // Add at location 1
    a.add("x"); // Add at end
    // Add a collection:
    a.addAll(Countries.names(5));
    // Add a collection starting at location 3:
    a.addAll(3, Countries.names(5));
    b = a.contains("1"); // Is it in there?
    // Is the entire collection in there?
    b = a.containsAll(Countries.names(5));
    // Lists allow random access, which is cheap
    // for ArrayList, expensive for LinkedList:
    s = a.get(1); // Get (typed) object at location 1
    i = a.indexOf("1"); // Tell index of object
    b = a.isEmpty(); // Any elements inside?
    it = a.iterator(); // Ordinary Iterator
    lit = a.listIterator(); // ListIterator
    lit = a.listIterator(3); // Start at loc 3
    i = a.lastIndexOf("1"); // Last match
    a.remove(1); // Remove location 1
    a.remove("3"); // Remove this object
    a.set(1, "y"); // Set location 1 to "y"
    // Keep everything that's in the argument
    // (the intersection of the two sets):
    a.retainAll(Countries.names(5));
    // Remove everything that's in the argument:
    a.removeAll(Countries.names(5));
    i = a.size(); // How big is it?
    a.clear(); // Remove all elements
  }
  public static void iterMotion(List<String> a) {
    ListIterator<String> it = a.listIterator();
    b = it.hasNext();
    b = it.hasPrevious();
    s = it.next();
    i = it.nextIndex();
    s = it.previous();
    i = it.previousIndex();
  }
  public static void iterManipulation(List<String> a) {
    ListIterator<String> it = a.listIterator();
    it.add("47");
    // Must move to an element after add():
    it.next();
    // Remove the element after the newly produced one:
    it.remove();
    // Must move to an element after remove():
    it.next();
    // Change the element after the deleted one:
    it.set("47");
  }
  public static void testVisual(List<String> a) {
    print("a = " + a);
    List<String> b = Countries.names(5);
    print("b = " + b);
    a.addAll(b);
    print("74" + a);
    // Insert, remove, and replace elements
    // using a ListIterator:
    ListIterator<String> x = a.listIterator(a.size()/2);
    x.add("---one---");
    print("78"+a);
    print(x.next());
    x.remove();
    print("81"+x.next());
    x.set("47");
    System.out.println("\nsize ---" + a.size());
    print(a);
    // Traverse the list backwards:
    x = a.listIterator(a.size());
    System.out.println("\nsize ---" + a.size());
    while(x.hasPrevious())
      printnb(x.previous() + " ");
    print();
    print("testVisual finished");
  }
  // There are some things that only LinkedLists can do:
  public static void testLinkedList() {
    LinkedList<String> ll = new LinkedList<String>();
    ll.addAll(Countries.names(5));
    print(ll);
    // Treat it like a stack, pushing:
    ll.addFirst("one");
    ll.addFirst("two");
    print(ll);
    // Like "peeking" at the top of a stack:
    print(ll.getFirst());
    // Like popping a stack:
    print(ll.removeFirst());
    print(ll.removeFirst());
    // Treat it like a queue, pulling elements
    // off the tail end:
    print(ll.removeLast());
    print(ll);
  }
  public static void main(String[] args) {
    // Make and fill a new list each time:
    System.out.println("basicTest start");
    basicTest(
      new LinkedList<String>(Countries.names(5)));
    basicTest(
      new ArrayList<String>(Countries.names(5)));
    System.out.println("basicTest end");

    System.out.println("iterMotion");
    iterMotion(
      new LinkedList<String>(Countries.names(5)));
    iterMotion(
      new ArrayList<String>(Countries.names(5)));
    System.out.println("end iterMotion");

    System.out.println("iterManipulation start");
    iterManipulation(
      new LinkedList<String>(Countries.names(5)));
    iterManipulation(
      new ArrayList<String>(Countries.names(5)));
    System.out.println("iterManipulation end");

    System.out.println("\ntestVisual start");
    testVisual(
      new LinkedList<String>(Countries.names(5)));
    System.out.println();

    testLinkedList();
  }
} /* (Execute to see output) *///:~
