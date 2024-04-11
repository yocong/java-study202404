package day04;

import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//
//
//        String inputName = sc.nextLine();
//        String myName = "홍길동";
//        System.out.println(myName);
//        System.out.println(inputName);
//
//        // == --> 객체의 주소값을 비교 (다르다)
//        // equals() --> 한글자씩 반복문을 통해 돌면서 확인 (같다)
//        if (myName.equals(inputName)) {
//            System.out.println("두 문자열이 같아!");
//        } else {
//            System.out.println("두 문자열이 다르다!");
//
//        }

        // 기본자료형은 == 비교 O
        int a = 10;
        int b = 10;
        System.out.println(a == b); // true

        char c = 'A';
        char d = 'A';
        System.out.println(c == d); // true

        // 객체타입은 == 비교 X, equals를 통해 비교
        Dog e = new Dog();
        Dog f = new Dog();
        System.out.println(e == f); // false
    }
}
