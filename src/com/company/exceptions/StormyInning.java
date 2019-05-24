package com.company.exceptions;

/**
 * page 394
 */
class BaseballException extends Exception {
}
class Foul extends BaseballException {}
class Strike extends BaseballException {}

abstract class Inning {
    public Inning() throws BaseballException {}
    public void event() throws BaseballException {}
    public abstract void atBat() throws Strike, Foul;
    public void walk() {}
}

class StormException extends Exception {}
class RainedOut extends StormException {}
class PopFoul extends Foul {}

interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}

public class StormyInning extends Inning implements Storm {

    public StormyInning() throws RainedOut, BaseballException {}
    public StormyInning(String s) throws Foul, BaseballException {}

//    public void walk() throws PopFoul {}
//    public void event() throws RainedOut {}
    public void event() {}

    @Override
    public void atBat() throws PopFoul {
    }

    @Override
    public void rainHard() throws RainedOut {
    }

    public static void main(String[] args) {
        StormyInning si = null;
        try {
            si = new StormyInning();
            si.atBat();
        } catch (PopFoul p) {
            System.out.println("Pop");
        } catch (RainedOut rainedOut) {
            System.out.println("Rained");
        } catch (BaseballException e) {
            System.out.println("Baseball");
        }

    }
}
