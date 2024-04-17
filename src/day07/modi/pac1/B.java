package day07.modi.pac1;

import day07.modi.pac2.C;

class B {

    public int z1;
    int z2;
    private int z3;

    void test() {

        A a1 = new A(50); // public
        A a2 = new A(5.55); // default
//        A a3 = new A(true); // private

        a1.f1 = 20; // public
        a2.f2 = 50; // default
//        a1.f3 = 500; // private

        a1.m1();
        a1.m2();
//        a1.m3(); // private

        C c = new C();
        c.y1 = 10;
//        c.y2 = 20;
//        c.y3 = 30;
    }
}
