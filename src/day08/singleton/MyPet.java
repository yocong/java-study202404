package day08.singleton;

public class MyPet {

    // 2. 스스로 자신의 객체를 단 하나 생성
    private static MyPet obj = new MyPet();

    private String name;

    // 싱글톤 패턴: 클래스에서 객체를 단 하나만 생성하도록 제한하는 패턴
    // 1. 객체생성을 금지시킴
    private MyPet() {

    }

    // 3. 공개된 메서드를 통해 미리 만들어둔 단 하나의 객체를 제공
    public static MyPet getInstance() {
        return obj;
    }

    void introduce() {
        System.out.printf("내 애완동물은 %s입니다.\n", name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
