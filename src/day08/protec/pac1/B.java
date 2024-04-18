package day08.protec.pac1;

public class B {

    void test() {

        A a = new A(); // public 생성자
        new A(10); // protected 생성자
        new A(3.3); // default 생성자

        a.f1 = 10; a.f2 = 30;
        a.m1(); a.m2();
    }
}
