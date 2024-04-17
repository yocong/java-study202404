package day07.modi.pac1;

public class A {

    // 필드
    public int f1;
    int f2; // defalut 제한
    private int f3;

    // 메서드
    public void m1() {}
    void m2() {} // defalut 제한
    private void m3() {}

    // 생성자
    public A(int a) {}
    A(double b) {} // defalut 제한
    private A(boolean c) {}

    void test() {
        this.f1 = 10;
        this.f2 = 10;
        this.f3 = 10;

        m1();
        m2();
        m3();

        new A(10); // public
        new A(5.5); // double
        new A(false); // private
    }
}
