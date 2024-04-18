package day08.protec.pac2;

import day08.protec.pac1.A;

public class D extends A {

    D() {
        // 다른패키지에서 상속받는 자식은 접근가능 (protected)
        super(5);

        f1 = 100; // protected
//        f2 = 200; // default

        m1();
//        m2();
        }
    void test() {
        A a = new A();
//        f1 = 10; f2 = 30;
//        m1(); m2();
    }
}
