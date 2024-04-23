package day11.generic;

// 제너릭 클래스: 타입 복제가 가능한 클래스
public class Basket<F> {

    private F fruit;

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }

    public F getFruit() {
        return fruit;
    }
}
