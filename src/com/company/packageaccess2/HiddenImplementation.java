package com.company.packageaccess2;

import com.company.interfaces.A2;
import com.company.packageaccess.HiddenC;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * page 496
 */
public class HiddenImplementation {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        A2 a2 = HiddenC.makeA2();
        a2.f();
        System.out.println(a2.getClass().getName());
//        if (a2 instanceof C) {}
//        C c = (C) a2;
//        c.g();
        callHiddenMethod(a2, "u");
        callHiddenMethod(a2, "v");
        callHiddenMethod(a2, "w");
    }

    static void callHiddenMethod(Object a, String methodName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }


}
