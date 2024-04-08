package day02;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
        /*
         - 스캐너를 사용하여 이름과 나이를 입력받아서

         이름: XXX
         나이: XX세
         출생년도: XXXX년

         을 출력하세요. (출력 함수는 마음대로 사용해서 출력하시고
         출생년도는 입력사항이 아닙니다.)
         */
//        Scanner scan = new Scanner(System.in);
//        System.out.print("이름 : ");
//        String name = scan.nextLine();
//        System.out.print("나이 : ");
//        int age = Integer.parseInt(scan.nextLine());
//        System.out.print("출생년도 : ");
//        int bY = Integer.parseInt(scan.nextLine());
//        System.out.printf("나의 이름은 %s이고, 나이는 %d, 태어난 년도는 %d년입니다.", name, age, bY );

        Scanner scan = new Scanner(System.in);
        System.out.println("**** 상품 재고 총액 구하기****");
        System.out.print("- 상품의 가격: ");
        int price = Integer.parseInt(scan.nextLine());
        System.out.print("- 상품의 수량: ");
        int amount = Integer.parseInt(scan.nextLine());

        int total = price * amount;
        System.out.printf("상품의 가격은 %d원이고, 상품의 수량은 %d개입니다.", price, amount);
    }
}
