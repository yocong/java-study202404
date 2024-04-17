package day06.member;

import java.util.Arrays;

// 역할: 회원 배열을 관리하는 역할 - 회원 데이터 저장소
public class MemberRepository {

    // 필드
    // const members =[{}, {}, {}];
//    static Member[] members; // 현재 관리되는 회원 배열
//    static Member[] restoreList; // 삭제된 회원들이 모일 배열

    // 배열과 함수 등을 같이 묶을 수 있어서 MemberList이용
    // const members = {
    //      mArr: [{},{},{}],
    //      push:
    // };
    MemberList members;
    MemberList restoreList;

    // 생성자
    MemberRepository() {
//        this.members = new Member[3];
//        Member m1 = new Member(); // 1개의 멤버 객체를 생성
//        Member[] m2 = new Member[]; // 여러개의 멤버 객체를 저장할 배열을 생성
//        members[0] = new Member("abc@def.com", "1234", "콩순이", "여성", 50);
//        members[1] = new Member("ghi@def.com", "5432", "팥돌이", "남성", 40);
//        members[2] = new Member("xyz@def.com", "7890", "팥죽이", "여성", 30);

        this.members = new MemberList();
        members.push(new Member("abc@def.com", "1234", "콩순이", "여성", 50));
        members.push(new Member("ghi@def.com", "5432", "팥돌이", "남성", 40));
        members.push(new Member("xyz@def.com", "7890", "팥죽이", "여성", 30));

        this.restoreList = new MemberList();
    }

    // 메서드


    /**
     * 생성된 회원정보를 회원 배열에 끝에 추가하는 기능
     * @param newMember - 사용자의 입력으로 전달된 회원 정보 객체
     */
    void addNewMember(Member newMember) {

        // 배열에 데이터를 추가하는 로직
//        Member[] temp = new Member[members.length + 1];
//        for (int i = 0; i < members.length; i++) {
//            temp[i] = members[i];
//        }
//        temp[temp.length - 1] = newMember;
//        members = temp;

        members.push(newMember);
    }

    /**
     * 이메일 중복을 확인하는 기능
     * @param targetEmail - 검사할 사용자의 입력 이메일 값
     * @return - 이메일이 이미 존재한다면 true,
     *           존재하지 않는 사용가능한 이메일이면 false
     * @author - 코딩킹
     * @since 2024.04.16
     */
    boolean isDuplicateEmail(String targetEmail) {
        // 이메일을 통해 회원을 찾았다면 이미 존재한다는 것이므로 (= 중복) true
        return members.findIndex(targetEmail) != -1;
    }

    /**
     * 이메일을 통해 회원의 모든 정보(객체)를 가져오는 메서드
     * @param inputEmail - 사용자가 입력한 이메일값
     * @return - 해당 이메일을 통해 찾아낸 회원 객체,
     *           만약 찾지 못하면 null을 리턴
     */
    public Member findMemberByEmail(String inputEmail) {
//        for (Member m : members) {
//            if (inputEmail.equals(m.email)) {
//                return m;
//            }
//        }
//        return null;

        return members.get(inputEmail);
    }

//    int findIndex(String email) {
//        for (int i = 0; i < members.length; i++) {
//            if (email.equals(members[i].email)) {
//                return i;
//            }
//        }
//        return -1;
//    }

    // 배열에서 회원정보 삭제 (+ 복구 리스트에 담기)
    public void removeMember(String inputEmail) {

//        int index = findIndex(inputEmail);
        int index = members.findIndex(inputEmail);

        if (index == -1) return;
//        for (int i = index; i < members.length - 1; i++) {
//            members[i] = members[i + 1];
//        }
//
//        Member[] temp = new Member[members.length - 1];
//        for (int i = 0; i < temp.length; i++) {
//            temp[i] = members[i];
//        }
//        members = temp;

        // members배열에서 삭제 후 삭제된 member를 리턴받음
        Member removed = members.remove(index);
        restoreList.push(removed);

//        System.out.println(Arrays.toString(members.mArr));
//        System.out.println(Arrays.toString(restoreList.mArr));
    }

    public Member findRestoreMemberByEmail(String inputEmail) {

        return restoreList.get(inputEmail);
    }

    // 삭제된 회원 복구
    public void restore(String inputEmail) {
        int index = restoreList.findIndex(inputEmail);
        if (index == -1) return;

        Member removed = restoreList.remove(index);
        members.push(removed);
//        System.out.println(Arrays.toString(members.mArr));
//        System.out.println(Arrays.toString(restoreList.mArr));
    }
}
