package com.company.intefrace;

/**
 * @Author Eckel
 * page #284
 */
class A {
    interface B {
        void f();
    }

    public class BImpl implements B {
        @Override
        public void f() {
        }
    }

    public class BImpl2 implements B {
        @Override
        public void f() {
        }
    }

    public interface C {
        void f();
    }

    class CImpl implements C {
        @Override
        public void f() {
        }
    }
//  CAN BE private
    private interface D {
        void f();
    }

    public class DImpl implements D {
        @Override
        public void f() {
        }
    }

    public class DImpl2 implements D {
        @Override
        public void f() {
        }
    }

    public D getD() {
        return new DImpl2();
    }

    private D dRef;

    public void receiveD(D d) {
        dRef = d;
        dRef.f();
    }
}

interface E {
    interface G {
        void f();
    }
    public interface H {
        void f();
    }
    void g();
}

public class Nesting {
    public class BImp implements A.B {
        @Override
        public void f() {
        }
    }
    class EImp implements E {
        @Override
        public void g() {
        }
    }
    class EGImp implements E.G {
        @Override
        public void f() {
        }
    }
    class EGImp2 implements E {
        @Override
        public void g() {
        }
        class EG implements E.G {
            @Override
            public void f() {
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
//        A.D
//        A.DImpl2 dImpl2 = a.getD();
//        a.getD().f();
        A a2 = new A();
        a2.receiveD(a.getD());
    }
}
