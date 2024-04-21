package day05;

import java.util.Arrays;

// 스트링 배열을 관리하는 객체의 설계도

// 쓰이는 배열들을 필요할 때 마다 생성해서 사용X -> 관리할 수 있는 클래스를 만들어서 사용
// sArr처럼 하나의 배열 필드를 만들어서 객체 생성할 때 마다 참조해서 사용하면 편리
// 또한 메서드들을 sArr로 등록해서 통합해서 사용가능하기 때문에 코드도 많이 줄게됨
public class StringList {

    // 스트링 배열을 필드로 등록
    String[] sArr;

    // 생성자를 통해 스트링 배열을 초기화
    StringList() {
        sArr = new String[0]; // 빈 배열
    }

    // 생성자 파라미터로 가변배열을 받으면
    // main메서드에서 내가 넣고싶은 배열로 계속 초기화 가능
    // 단, 가변배열로 받아야하기 때문에 []는 들어올 수 없음
    StringList(String... initData) {
        sArr = initData;
    }
    // []로 받게되면 main메서드에서 특정 배열을 생성하여
    // 생성한 객체에 넣어주어 사용
//    StringList(String[] initData) {
//        sArr = initData;
//    }


    // 배열 내부를 출력하는 메서드
    public String toString() {
        return Arrays.toString(sArr);
    }

    // 배열 내부 요소의 수를 알려주는 메서드
    int size() {
        return sArr.length;
    }

    // 배열에 맨 끝에 데이터를 추가하는 메서드
    void push(String newData) {
        String[] temp = new String[sArr.length + 1];
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        temp[temp.length -1] = newData;
        sArr = temp;
    }

    // 배열 맨 끝데이터 제거
    void pop() {
        String[] temp = new String[sArr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = sArr[i];
        }
        sArr = temp;
    }

    // 인덱스 탐색 (indexOf)
    public int indexOf(String target) {
        for (int i = 0; i < sArr.length; i++) {
            if (target.equals(sArr[i])) {
                return i;
            }
        }
        return -1;
    }

    // 자료 유무 확인 (includes)
    public boolean includes(String target) {
        return indexOf(target) != -1;
    }

    // 중간 삭제 (remove) : 인덱스로 삭제
    public String remove(int index) {
        if (index < 0 || index > sArr.length - 1) return null;

        String targetData = sArr[index];
        for (int i = index; i < sArr.length - 1; i++) {
            sArr[i] = sArr[i + 1];
        }
        pop();
        return targetData;
    }
    // 중간 삭제 (remove) : 값으로 삭제
    // 값의 index를 구한 후 -> 위의 remove 메서드로 삭제
    public String remove(String target) {
        return remove(indexOf(target));
    }

    // 중간 삽입 (insert)
    public void insert(int index, String newData) {

        if (index < 0 || index > sArr.length) return;
        if (index == sArr.length) push(newData);

        String[] temp = new String[sArr.length + 1];
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        for (int i = temp.length - 1; i > index; i--) {
            temp[i] = temp[i-1];
        }
        temp[index] = newData;
        sArr = temp;
    }

    // 배열 데이터 수정
    public void set(int index, String data) {
        if (index < 0 || index > sArr.length -1) return;
        sArr[index] = data;
    }

    public void clear() {
        sArr = new String[0]; // 빈 배열
    }

    public boolean isEmpty() {
        return sArr.length == 0;
    }
}
