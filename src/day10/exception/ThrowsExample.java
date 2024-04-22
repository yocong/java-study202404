package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExample {

    // 정수를 입력받아 리턴하는 메서드

    // throws : 생길 수 있는 예외 명시, catch는 니 맘대로 설정해 (에러 떠넘김)
    // 주로 라이브러리 만들 때 throws 사용
    // -> 다른사람들이 사용하기 때문에 예외만 명시해주고 catch문은 사용자가 알아서 할 수 있게함
    public int inputNumber() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;

    }

    // 문자열을 정수로 변환하는 메서드
    public int convert(String str) throws NumberFormatException {

        int n = Integer.parseInt(str);
        return n;

    }
}
