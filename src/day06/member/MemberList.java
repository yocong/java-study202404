package day06.member;

// 역할: MemberRepository에서 배열필드를 정의하지않고 이 곳에 정의하여 가독성과 유지보수성을 올림
//      또한 배열을 다루는 다양한 메서드도 정의해놓았기 때문에
//      MemberRepository에서 간단하게 사용가능!
public class MemberList {

    // 배열을 필드로 등록

    // Member 배열로 등록했으므로 Member 클래스의 객체만 포함될 수 있음
    private Member[] mArr;

    // 생성자를 통해 배열 초기화
    MemberList() {
        this.mArr = new Member[0]; // 빈 배열
    }

    // 맨 끝에 추가
    void push(Member newMember) {
        Member[] temp = new Member[mArr.length + 1];
        for (int i = 0; i < mArr.length; i++) {
            temp[i] = mArr[i];
        }
        temp[temp.length - 1] = newMember;
        mArr = temp;
    }

    // 인덱스 찾기
    int findIndex(String email) {
        for (int i = 0; i < mArr.length; i++) {
            if (email.equals(mArr[i].email)) {
                return i;
            }
        }
        return -1;
    }

    // 한 명의 회원 정보 얻기
    Member get(String email) {
        int index = findIndex(email);
        if (index == -1) return null;
        return get(index);
    }
    Member get(int index) {
        return mArr[index];
    }

    // 맨 끝 제거
    private Member pop() {
        // 맨 끝 회원 백업
        Member lastMember = mArr[mArr.length - 1];
        Member[] temp = new Member[mArr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = mArr[i];
        }
        mArr = temp;
        return lastMember;
    }

    // 회원 정보 삭제
    public Member remove(int index) {
        // 삭제 대상 백업
        Member removedMember = mArr[index];
        for (int i = index; i < mArr.length - 1; i++) {
            mArr[i] = mArr[i + 1];
        }
        pop();
        return removedMember;
    }
    Member remove(Member deleteMember) {
        int index = findIndex(deleteMember.email);
        return remove(index);
    }

    // 배열에 저장된 요소 수 리턴
    int size() {
        return mArr.length;
    }

    // 배열 리턴
    Member[] getMembers() {
        return mArr;
    }

}

