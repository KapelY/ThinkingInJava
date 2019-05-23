package com.company.collections;

import java.util.*;

import static com.company.collections.QueueDemo.printQ;

/**
 * page 353
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue =
                new PriorityQueue<>();
        Random random = new Random(42);
        for (int i = 0; i < 10; i++) {
            priorityQueue.offer(random.nextInt(i + 10));
        }
        printQ(priorityQueue);

        List<Integer> ints = Arrays.asList(25, 22, 20,
                18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<>(ints);
        printQ(priorityQueue);
        priorityQueue = new PriorityQueue<>(ints.size(), Collections.reverseOrder());
        priorityQueue.addAll(ints);
        printQ(priorityQueue);

        String fact = "EDUCATION SHOULD ESCHEM OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split(""));
        PriorityQueue<String> stringPQ = new PriorityQueue<>(strings);
        printQ(stringPQ);
        stringPQ = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
        stringPQ.addAll(strings);
        printQ(stringPQ);

        Set<Character> characters = new HashSet<>();
        for (char c : fact.toCharArray())
            characters.add(c);
        PriorityQueue<Character> charactersPQ = new PriorityQueue<>(characters);
        printQ(charactersPQ);
    }
}
