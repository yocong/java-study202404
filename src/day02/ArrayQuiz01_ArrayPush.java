package day02;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz01_ArrayPush {
    public static void main(String[] args) {

        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요.");
        Scanner sc = new Scanner(System.in);
        // 배열 생성, String[] FoodList = {}; 로 입력가능
        String[] foodList = new String[0];
        while (true) {
            // 음식 1개를 저장하는 코드
            String newFood = sc.nextLine();

            if (newFood.equals("그만")) break;
            else {
                // 기존 배열보다 사이즈가 1개 큰 새 배열 생성
                String[] temp = new String[foodList.length + 1];
                // 기존 FoodList에 있던 음식들 새 배열로 복사
                for (int i = 0; i < foodList.length; i++) {
                    temp[i] = foodList[i];
                }
                // 새 음식을 새 배열의 끝 인덱스에 추가
                temp[temp.length - 1] = newFood;
                // temp가 관리하는 새 배열을 기존 FoodList로 주소값 이전
                foodList = temp;
                temp = null;
            }
        }
        System.out.println("먹고 싶은 음식리스트: " + Arrays.toString(foodList));

    }
}


//}
