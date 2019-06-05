package com.company.generics;

import java.sql.Time;
import java.util.Date;

/**
 * page 580
 */
class BasicDecoration {
    private String value;

    public void set(String value) {
        value = value;
    }

    public String get() {
        return value;
    }
}

class Decorator extends BasicDecoration {
    protected BasicDecoration basic;

    public Decorator(BasicDecoration basic) {
        this.basic = basic;
    }

    public void set(String val) {
        basic.set(val);
    }

    public String get() {
        return basic.get();
    }
}

class TimeStampedDecoration extends Decorator {
    private final long timeStamp;

    public TimeStampedDecoration(BasicDecoration basic) {
        super(basic);
        this.timeStamp = new Date().getTime();
    }

    public long getStamp() {
        return timeStamp;
    }
}

class SerialNumberedDecoration extends Decorator {
    private static long counter = 1;
    private final long serialNumber = counter++;

    public SerialNumberedDecoration(BasicDecoration basic) {
        super(basic);
    }

    public long getSerialNumber() {
        return serialNumber;
    }
}

public class Decoration {
    public static void main(String[] args) {
        TimeStampedDecoration t = new TimeStampedDecoration(new BasicDecoration());
        TimeStampedDecoration t2 = new TimeStampedDecoration(
                new SerialNumberedDecoration(new BasicDecoration()));
        SerialNumberedDecoration s = new SerialNumberedDecoration(new BasicDecoration());
        SerialNumberedDecoration s2 = new SerialNumberedDecoration(new TimeStampedDecoration(new BasicDecoration()));

    }
}
