package com.company.collections;

import java.util.Map;

/**
 * page 357
 */
public class EnvironmentVariables {
    public static void main(String[] args) {
        for (Map.Entry entry: System.getenv().entrySet()) {
            System.out.println(entry.getKey() + ": " +
                    entry.getValue());
        }
    }
}
