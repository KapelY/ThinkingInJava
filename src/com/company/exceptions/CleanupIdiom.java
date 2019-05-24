package com.company.exceptions;

/**
 * page 401
 */

class NeedsCleanup {
    private static long counter = 1;
    private final long id = counter++;
    public void dispose() {
        System.out.println("NeedsCleanUp " + id + " released");
    }
}
class ConstructionException extends Exception {}
class NeedsCleanup2 extends NeedsCleanup {
    public NeedsCleanup2() throws ConstructionException {
    }
}

public class CleanupIdiom {
    public static void main(String[] args) {
        NeedsCleanup nc1 = new NeedsCleanup();
        try {

        } finally {
            nc1.dispose();
        }

        NeedsCleanup nc2 = new NeedsCleanup();
        NeedsCleanup nc3 = new NeedsCleanup();
        try {

        } finally {
            nc3.dispose();
            nc2.dispose();
        }
    }
}
