package com.company.nullObj;

import java.util.List;

/**
 * page 491
 */
interface Operation {
    String description();
    void command();
}
public interface Robot {
    String name();
    String model();
    List<Operation> operations();
    class Test {
        public static void test(Robot r) {
            if (r instanceof Null) {
                System.out.println("Null Robot");
            }
            System.out.println("name " + r.name());
            System.out.println("model " + r.model());
            for (Operation operation: r.operations()) {
                System.out.println(operation.description());
                operation.command();
            }
        }
    }
}
