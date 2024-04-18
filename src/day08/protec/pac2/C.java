package day08.protec.pac2;

import day08.protec.pac1.A;

public class C {

    void test() {
        A a = new A();
        // 다른 패키지 불가능
//        new A(10); // protected
//        new A(5.5); // default

//        a.f1 = 10; a.f2 = 30;
//        a.m1(); a.m2();
    }
}
