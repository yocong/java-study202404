package day08.final_;

public class Student {

    String name;
    final String ssn; // 주민번호
    String nation; // 국적

    // final은 한 번 정하면 변경이 불가능
    // 정해지기전에 지역변수에서도 변수가 수정될 수 있으므로
    // 지역변수에도 final을 건다.
    Student(final String ssn) {
//        ssn = "asdfasdf";
        this.ssn = ssn;
    }

    // final은 변경이 불가능하므로 setter X
}
