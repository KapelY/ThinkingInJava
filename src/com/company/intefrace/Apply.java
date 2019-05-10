package com.company.intefrace;

import java.util.Arrays;

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {
    String process(Object input) {
        return ((String) input).toUpperCase();
    }
}

class Downcase extends Processor {
    String process(Object input) {
        return ((String) input).toLowerCase();
    }
}

class Splitter extends Processor {
    @Override
    String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}

public class Apply {
    private static void process(Processor p, Object s) {
        System.out.println("Uses Processor: " + p.name());
        System.out.println(p.process(s));
    }

    public static void main(String[] args) {
        String string = "We are the champions";
        process(new Upcase(), string);
        process(new Downcase(), string);
        process(new Splitter(), string);
    }
}

