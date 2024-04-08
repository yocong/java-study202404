package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");
        String[] FoodList = new String[0];
        while (true) {
            String newFood = scan.nextLine();

            if (newFood.equals("그만")) break;
            else {
                String[] temp = new String[FoodList.length + 1];
                for (int i = 0; i < FoodList.length; i++) {
                    temp[i] = FoodList[i];
                }
                temp[temp.length - 1] = newFood;
                FoodList = temp;
                temp = null;
            }
        }
        System.out.println("먹고 싶은 음식리스트: " + Arrays.toString(FoodList));

    }
}
