package day11.collection.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        // 같음
//        BookList bookList = new BookList();
//        ArrayList<Book> foods = new ArrayList<>();

        List<String> foods = new ArrayList<>();

        foods.add("짜장면");
        foods.add("볶음밥");
        foods.add("파스타");
        foods.add("리조또");

        System.out.println(foods);

        // 중간삽입 add(index, element)
        foods.add(1,"짬뽕");
        System.out.println(foods);

        int size = foods.size();
        System.out.println("size = " + size);

        int idx = foods.indexOf("파스타");
        System.out.println("idx = " + idx);

        boolean flag = foods.contains("파스타");
        System.out.println("flag = " + flag);

        foods.remove(0);
        foods.remove("파스타");

        System.out.println(foods);

        foods.set(0, "동파육");

        System.out.println(foods);

        String s = foods.get(1); // foods[1]
        System.out.println("s = " + s);

        // 반복문 처리
        for (int i = 0; i < foods.size(); i++) {
            System.out.println(foods.get(i) + " 개존맛 ㅎ");
        }
        System.out.println("==========================");

        for (String food : foods) {
            System.out.println(food + " JMT ㅎ!");
        }

        foods.clear();
        System.out.println(foods);

        System.out.println(foods.isEmpty());

        // 리스트에 초기값 넣고 시작하기
        int[] arr = {10, 20, 30};
        List<Integer> numbers = new ArrayList<>(List.of(24, 99, 10, 20 ,30));
        System.out.println("numbers = " + numbers);
        
        // 오름차 정렬
        numbers.sort(Integer::compareTo);
        System.out.println("numbers = " + numbers);
        
        // 내림차 정렬
        numbers.sort(Comparator.reverseOrder());
        System.out.println("numbers = " + numbers);

    }
}
