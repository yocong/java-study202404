package day09.poly.casting;

public class Child extends Parent {

    int c1;

    @Override
    public void method1() {
        System.out.println("Overriding한 Child의 method1");
    }

    public void method2() {
        System.out.println("Child의 method2");
    }
}
