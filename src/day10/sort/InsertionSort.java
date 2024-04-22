package day10.sort;

import java.util.Arrays;

public class InsertionSort {

    //insertion sort
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) { // 삽입할 항목 선택
            int temp = arr[i]; // 삽입할 항목 빼놓기

            int j = i; // 삽입할 항목 지정
            while (j > 0 && arr[j - 1] >= temp) { // 삽입할 항목보다 작은 값을 찾을 때까지
                arr[j] = arr[j - 1]; // 삽입할 항목보다 큰 값은 오른쪽으로 이동
                j--;
            }
            arr[j] = temp; // 삽입할 위치에 삽입
        }
    }

    public static void main(String[] args) {


        int[] arr = {33, 11, 99, 1, 22, 88, 55, 44, 66, 77};

        sort(arr); // 정렬 수행

        Arrays.sort(arr);
        System.out.println("정렬 후: " + Arrays.toString(arr));
    }
}
