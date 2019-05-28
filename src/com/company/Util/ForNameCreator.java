package com.company.Util;

import java.util.ArrayList;
import java.util.List;

/**
 * page 469
 */
public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types =
            new ArrayList<>();
    private static String[] typeNames = {
            "com.company.Util.Mutt",
            "com.company.Util.Pug",
            "com.company.Util.EgyptianMau",
            "com.company.Util.Manx",
            "com.company.Util.Cymric",
            "com.company.Util.Rat",
            "com.company.Util.Mouse",
            "com.company.Util.Hamster"
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        for (String name : typeNames) {
            try {
                types.add(
                        (Class<? extends Pet>) Class.forName(name)
                );
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    static {
        loader();
    }

    @Override
    public List<Class<? extends Pet>> types() {
        return types;
    }
}
