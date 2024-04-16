package day06.member;

// 역할: 회원 배열을 "관리"하는 역할 - 회원 데이터 저장소
public class MemberRepository {

    // 필드
    static Member[] members;

    // 생성자
    MemberRepository() {
        this.members = new Member[3];
        members[0] = new Member("abc@afwe.com", "1234", "콩순이", "여성", 50);
        members[1] = new Member("aweva@afwewe.com", "4142", "팥돌이", "남성", 40);
        members[2] = new Member("abaetbabc@afaqwefwe.com", "3245", "팥순이", "여성", 30);
    }

    // 메서드

    // 회원정보 생성
    void addNewMember(Member newMember) {

        // 배열에 데이터를 추가하는 로직 (push)
        Member[] temp = new Member[members.length + 1];
        for (int i = 0; i < members.length; i++) {
            temp[i] = members[i];
        }
        temp[temp.length -1] = newMember;
        members = temp;
    }
}
