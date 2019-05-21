package com.company.interfaces;

/**
 * @Author Eckel
 * page #285 & 301-302
 */
interface Service {
    void method1();
    void method2();
}
interface ServiceFactory {
    Service getService();
}
class Implementation1 implements Service {
    Implementation1(){};
    @Override
    public void method1() {
        System.out.println("impl1 method1");
    }
    @Override
    public void method2() {
        System.out.println("impl1 method2");
    }
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation1();
        }
    };
}
class Implementation1Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implementation1();
    }
}
class Implementation2 implements Service {
    Implementation2(){};
    @Override
    public void method1() {
        System.out.println("impl2 method1");
    }
    @Override
    public void method2() {
        System.out.println("impl2 method2");
    }
    public static ServiceFactory factory = new ServiceFactory() {
        @Override
        public Service getService() {
            return new Implementation2();
        }
    };
}
class Implementation2Factory implements ServiceFactory {
    @Override
    public Service getService() {
        return new Implementation2();
    }
}

public class Factories {
    public static void serviceConsumer(ServiceFactory factory) {
        Service s = factory.getService();
        s.method1();
        s.method2();
    }

    public static void main(String[] args) {
        serviceConsumer(new Implementation1Factory());
        serviceConsumer(new Implementation2Factory());
        serviceConsumer(Implementation1.factory);
        serviceConsumer(Implementation2.factory);
    }

}
