package day11.api.lang;

public class Wrapper {

    // 기본값 차이 유의하기
    private int number1; // 기본값 0
    private Integer number2; // 기본값 null

    // 객체인 number2를 생성자를 통해 기본값을 0으로 초기화 시킬 수 있다.
    public Wrapper(Integer number2) {
        this.number2 = 0;
    }

    public static void main(String[] args) {

        // Wrapper type (기본 타입을 객체로 포장함)
        // Byte, Short, Integer, Long, Boolean, Float, Double, Character
        Integer a = 10; // int a = 10; 과 동일함
        Double b = 3.3;
    }
}
