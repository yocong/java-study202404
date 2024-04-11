package day03;

import java.util.Arrays;

public class MethodQuiz {
    static String[] foods = {"떡볶이", "치킨", "파스타"};
    static String[] userNames = {"홍길동", "고길동"};

    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    // 사이즈를 조절해서 새 배열을 만드는 함수
    static String[] makeNewArray(int size) {
        return new String[foods.length + size];
    }

    // 기존 데이터를 복사하는 함수
    static String[] copy(int size) {
        String[] temp = makeNewArray(size);

        int loopCount = (size >= 0) ? foods.length : temp.length;

        for (int i = 0; i < loopCount; i++) {
            temp[i] = foods[i];
        }
        return temp;
    }

    static void push(String newFood) {
        String[] temp = copy(1);

        temp[temp.length - 1] = newFood;
        foods = temp;
//        temp = null; // 생략 가능, 함수 정의시 알아서 null 처리
    }

    static int indexOf(String food) {
        for (int i = 0; i < foods.length; i++) {
            if (food.equals(foods[i])) {
                return i;
            }
        }
        return -1;
    }

    // foods배열에서 맨 끝 데이터를 삭제하는 함수
    static void pop() {
        foods = copy(-1);

    }

    static String[] remove(String deleteTarget) {
        int index = -1;

        for (int i = 0; i < foods.length; i++) {
            if (deleteTarget.equals(foods[i])) {
                index = i;
                for (int j = i; j < foods.length - 1; j++) {
                    foods[j] = foods[j + 1];
                }
                break;
            }
        }
        if (index == -1) {
            System.out.printf("해당 메뉴(%s)은 존재하지 않습니다.", deleteTarget);
        } else {
            String[] temp = new String[foods.length - 1];
            for (int k = 0; k < temp.length; k++) {
                temp[k] = foods[k];
            }
            foods = temp;
            temp = null;
        }
        return foods;
    }

    static boolean include(String searchTarget) {
        return indexOf(searchTarget) != -1;
    }

    static void insert(int targetIndex, String newFood) {
        if (isOufOfBounds(targetIndex)) return;
        String[] temp = copy(1);
        for (int i = temp.length - 1; i > targetIndex; i--) {
            temp[i] = temp[i - 1];
        }
        temp[targetIndex] = newFood;
        foods = temp;
    }

    static void modify(int targetIndex, String newFood) {
        // 범위 밖이면 종료
        if (isOufOfBounds(targetIndex)) return;
        foods[targetIndex] = newFood;
    }

    static boolean isOufOfBounds(int targetIndex) {
        return targetIndex < 0 || targetIndex > foods.length - 1;
    }

    public static void main(String[] args) {


        printFoods();
        push("라면");
        push("김치찌개");
        printFoods();

        int index = indexOf("파스타");
        System.out.println("index = " + index);

        int index2 = indexOf("라면땅");
        System.out.println("index2 = " + index2);

//        pop();
        remove("치킨");
        printFoods();


        boolean flag1 = include("파스타");
        System.out.println("flag1 = " + flag1);

        boolean flag2 = include("떡라면");
        System.out.println("flag2 = " + flag2);

        insert(3, "파인애플");
        printFoods();

        modify(2, "닭갈비");
        printFoods();


    }
}
