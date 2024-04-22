package day10.abs;

public class Cat extends Pet {


    @Override
    public void eat() {
        System.out.println("고양이는 생선을 먹어요");
    }

    @Override
    public void sleep() {
        System.out.println("고양이는 낮잠을 많이 자요");
    }
}
