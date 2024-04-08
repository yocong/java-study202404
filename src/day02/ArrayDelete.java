package day02;

import java.util.Arrays;

public class ArrayDelete {
    public static void main(String[] args) {

        // 배열에서 원하는 위치의 값 삭제하기
        int[] numbers = {1, 3, 5, 7, 9, 11};

        int targetIndex = 0;

        for (int i = targetIndex; i < numbers.length - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
          // 5 삭제
//        numbers[2] = numbers[3]; // 5 -> 7, [1, 3, 7, 7, 9, 11]
//        numbers[3] = numbers[4]; // 7 -> 9, [1, 3, 7, 9, 9, 11]
//        numbers[4] = numbers[5]; // 9 -> 11, [1, 3, 7, 9, 11, 11]



        int[] temp = new int[numbers.length -1];
        for (int i = 0; i <temp.length; i++) {
            temp[i] = numbers[i];
        }
        numbers = temp;
        temp = null;

        System.out.println(Arrays.toString(numbers));
    }
}
