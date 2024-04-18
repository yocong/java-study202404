package day08.final_;

public class Main {

    public static void main(String[] args) {

        // final은 만들면 변경 불가능
        Student s = new Student("099999-111111");
        Student s2 = new Student("0919999-111111");
        s.name = "홍길동";
        s.nation = "대한민국";
        s.name = "피터 홍";
        s.nation = "카나다";
//        s.ssn = "zzzz";
//        s2.ssn = "zzzz";
    }
}
