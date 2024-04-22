package day10.exception;

public class TryExample1 {

    public static void main(String[] args) {

        int n1 = 10, n2 = 0;

        System.out.println("나눗셈 시작!");

        try {
            int result = n1 / n2; // 예외 발생 가능성이 있는 코드
        } catch(Exception e) {
            // 예외가 발생했을 경우 프로그래밍이 튕기는 대신 실행할 코드
            System.out.println("0으로 나누면 안됩니다~");
        }

        System.out.println("나눗셈 정상 종료!");
    }
}
