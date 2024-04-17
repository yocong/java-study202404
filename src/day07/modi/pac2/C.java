package day07.modi.pac2;

import day07.modi.pac1.A;
//import day07.modi.pac1.B;

public class C {

    public int y1;
    int y2;
    private int y3;

    void test() {

        A a = new A(100); // public
//        new A(3.14); // defalut
//        new A(false); // private

        a.f1 = 10; // public
//        a.f2 = 20; // defalut
//        a.f3 = 30; // private

        a.m1();
//        a.m2(); // defalut
//        a.m3(); // private

//        new B();
    }
}
