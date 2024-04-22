package day10.sort;

import java.util.Arrays;

public class SelectionSort {

    // swap연산 메서드
    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    // selection sort
    public static void sort(int[] arr) {

        // 최소값을 먼저 찾는다.
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i; // 최소값 인덱스 초기화

            for (int j = i + 1; j < arr.length; j++) { // 최소값 찾는 루프
                if (arr[j] < arr[min]) {
                    min = j; // 최소값 변경
                }
            }
            swap(arr, i, min); // 선택한값과 최소값 교환
        }

    }

    public static void main(String[] args) {


        int[] arr = {33, 11, 99, 1, 22, 88, 55, 44, 66, 77};

        sort(arr); // 정렬 수행

        System.out.println("정렬 후: " + Arrays.toString(arr));
    }

}
