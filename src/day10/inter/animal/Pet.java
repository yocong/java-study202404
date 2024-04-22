package day10.inter.animal;

public interface Pet {

    // 애완동물이라면 반드시 가져야 할 기능을 명세
    void handle(); // 애완동물은 다룰 수 있어야 함
    boolean inject();

}
