package day02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] students = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("* 우리반 학생들의 별명: [영웅재중, 최강창민, 시아준수, 믹키유천, 유노윤호]");
        System.out.println("삭제할 학생의 별명을 입력하세요!");
        // 삭제할 별명 저장하는 코드
        String deleteNickname = scan.nextLine();

        int index = -1;
        for (int i = 0; i <students.length; i++) {
            if(deleteNickname.equals(students[i])) {
                index = i;
                // 원하는 값을 삭제하기 위해 반복문 (i부터)
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[j+1];
                }
                break;
            }
        }
        if(index == -1) { // false
            System.out.printf("해당 별명(%s)은 존재하지 않습니다.", deleteNickname);
        } else { // true
            // 삭제하기 위해 임시배열을 만들어 임시배열로 옮김
            String[] temp = new String[students.length -1];
            for (int k = 0; k <temp.length; k++) {
                temp[k] = students[k];
            }
            // 주소값 이전
            students = temp;
            temp = null;

            System.out.println("삭제 후 정보: " + Arrays.toString(students));
        }
    }
}


//package day02;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class ArrayQuiz02 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String[] students = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
//
//        while (true) {
//            System.out.println("* 우리반 학생들의 별명: " + Arrays.toString(students));
//
//            // 탐색 알고리즘
//            System.out.println("- 삭제할 학생의 별명을 입력하세요");
//            System.out.print("> ");
//            String target = sc.nextLine();
//
//            int index = -1;
//            for (int i = 0; i < students.length; i++) {
//                if (target.equals(students[i]))  {
//                    index = i;
//                    break;
//                }
//            }
//
//            if (index != -1) {
//                // 삭제 알고리즘
//                for (int i = index; i < students.length - 1; i++) {
//                    students[i] = students[i + 1];
//                }
//
//                String[] temp = new String[students.length - 1];
//
//                for (int i = 0; i < students.length - 1; i++) {
//                    temp[i] = students[i];
//                }
//
//                students = temp;
//                temp = null;
//
//                System.out.println("* 삭제 후 정보: " + Arrays.toString(students));
//                break;
//            } else {
//                System.out.printf("해당 별명 (%s)은(는) 존재하지 않습니다.\n", target);
//            }
//        }
//
//
//    }
//}