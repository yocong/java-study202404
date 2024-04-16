package day06.member;

public class Test {

    public static void main(String[] args) {
        // Member 타입의 배열 생성
        // Member 타입만 배열에 들어갈 수 있음
        Member[] arr = new Member[5];

        Member m1 = new Member("rnfaos77@naver.com","1234","김철수", "남성", 30);
        Member m2 = new Member("awef@awef.com", "4141", "김영희", "여성", 13);

        arr[0] = m1; // Member 타입
        arr[1] = m2; // Member 타입
        arr[2] = new Member("adawe@naew.com", "3134", "홍길동","여성", 15);

        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);

        Member[] members = {m1, m2};
        System.out.println("members = " + members);

        System.out.println("======================");

        MemberRepository mr = new MemberRepository();
        MemberView mv = new MemberView();

        Member newMember = new Member("awef@afw.com", "4321", "찰떡이", "남성", 12);
        mr.addNewMember(newMember); // mr에서 추가
        mv.showMembers(); // mv에서 출력
    }
}
