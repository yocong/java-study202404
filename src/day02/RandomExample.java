package day02;

public class RandomExample {
    public static void main(String[] args) {

        // 연산자 우선순위
        // 단항(++, -- , !) > 이항(*, /, % ...) > 삼항(?:) > 대입(=)

        int a = 10;
        int b = ++a - 10 * 3;

        /*
            자바에서 난수만들기
         */

        // Math.random =>       0.0 <=  < 1.0
        // (int) Math.random => 0 <=  < 1

        // Math.random * 10 =>         0.0 <=  < 10.0
        // (int) (Math.random * 10) => 0 <=  < 10
        // -> Math.random * n 을 반드시 괄호로 묶어줌
        int random = (int) (Math.random() * 10) + 1;
        System.out.println("random = " + random);
    }
}
