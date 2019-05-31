package com.company.generics;

/**
 * page 507
 */
public class LInkedStack<T> {
    private static class Node<U> {
        U item;
        Node<U> next;
        Node() {
            item = null;
            next = null;
        }

        public Node(U item, Node<U> next) {
            this.item = item;
            this.next = next;
        }
        boolean end() {
            return item == null && next == null;
        }
    }
    public Node<T> top = new Node<>();
    public void push(T item) {
        top = new Node<>(item, top);
    }
    public T pop() {
        T result = top.item;
        if (!top.end())
            top = top.next;
        return result;
    }

    public static void main(String[] args) {
        LInkedStack<String> lss = new LInkedStack<>();
        for (String s : "Phasers on stun!".split(" "))
            lss.push(s);

        String s;
        while ((s = lss.pop()) != null)
            System.out.println(s);
    }
}
