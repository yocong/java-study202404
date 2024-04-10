package day03;

import java.util.Arrays;

public class MethodQuiz {
    static String[] foods = {"떡볶이", "치킨", "파스타"};
    static String[] userNames = {"홍길동", "고길동"};

    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    static String[] push(String str) {
        String newStr = str;

        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }
        temp[temp.length -1] = newStr;
        foods = temp;
        temp = null;
        return foods;
    }

    static int indexOf(String str) {
        int index = -1;
        String target = str;
        for (int i = 0; i < foods.length; i++) {
            if(target.equals(foods[i])) {
                index = i;
            }
        }
        return index;
    }


    static String[] remove(String str) {
        int index = -1;
        String menu = str;

        for (int i = 0; i < foods.length; i++) {
            if(menu.equals(foods[i])) {
                index = i;
                for (int j = i; j < foods.length - 1; j++) {
                    foods[j] = foods[j+1];
                }
                break;
            }
        }
        if(index == -1) {
            System.out.printf("해당 메뉴(%s)은 존재하지 않습니다.", menu);
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

    static boolean include(String str) {
        String menu = str;
        for (int i = 0; i < foods.length; i++) {
            if (menu.equals(foods[i])) {
                return true;
            }
        }
        return false;
    }

    static void insert(int n, String str) {

        String[] temp = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            temp[i] = foods[i];
        }

        for (int i = temp.length - 1; i > n ; i--) {
            temp[i] = temp[i-1];
        }
        temp[n] = str;
        foods = temp;
        temp = null;
    }

    static void modify(int n, String str) {
        foods[n] = str;
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
