package day12.stream.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>(
                List.of(
                        new Student("홍철수", 15, 79),
                        new Student("박영희", 17, 41),
                        new Student("손흥민", 11, 11),
                        new Student("감우성", 25, 34)
                )
        );

        // 나이 순으로 오름차 정렬 (나이 적은 순)
        studentList.sort((o1, o2) -> o1.getAge() - o2.getAge());

        // 성적 순으로 내림차 정렬 (성적 높은 순)
        studentList.sort(Comparator.comparing((Student s) -> s.getScore()).reversed());

        // 이름 순으로 오름차 정렬 (가나다순)
        studentList.sort(Comparator.comparing(s -> s.getName()));

        System.out.println(studentList);
    }
}
