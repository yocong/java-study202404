package day05;

public class ListMain {

    public static void main(String[] args) {

        /*
            const foods = {
                sArr: [],
                push: function(newData) {},
                ...
            };

            const userNames = {
                sArr: [],
                push: function(newData) {},
                ...
            };
         */

        StringList foods = new StringList();
        StringList userNames = new StringList();

        // 배열 내부 데이터 수 확인
        System.out.println(foods.size());
        System.out.println(userNames.size());

        // 배열에 데이터 추가
        foods.push("짬뽕");
        foods.push("치킨");
        userNames.push("박영희");

        foods.push("탕수육");

        // 자료 삭제
        foods.remove("짬뽕");

        // 자료 중간 삽입
        userNames.push("김철수");
        userNames.push("홍길동");

        userNames.insert(1, "뽀로로");
        foods.insert(1, "마라탕");

        // 배열 데이터 수정
        foods.set(0, "김치볶음밥"); // 0번 인덱스가 수정
        userNames.set(1, "대길이"); // 1번 인덱스가 수정

        // 배열 데이터 전체삭제
        foods.clear(); // foods배열 내부가 전체삭제되고 size가 0

        // 배열 데이터가 한개라도 있는지 확인
        boolean flag = foods.isEmpty(); // 배열이 비어있으면 true, 아니면 false
        System.out.println("flag = " + flag);


        // 초기 배열에 생성자에 전달한 데이터들이 들어있어야 함
        StringList hobbies = new StringList("안녕", "하이", "엥", "오잉", "또잉");
        hobbies.push("흐에");
        System.out.println("hobbies = " + hobbies.toString());

//        String[] awef = {"하이", "바이", "뚜이"};
//        StringList hobbies2 = new StringList(awef);
//        System.out.println("hobbies2 = " + hobbies2);


        System.out.println("foods = " + foods.toString());
        System.out.println("userNames = " + userNames.toString());
    }
}
