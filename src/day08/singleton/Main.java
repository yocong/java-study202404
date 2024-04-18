package day08.singleton;

public class Main {

    public static void main(String[] args) {

        // 하나의 객체를 바라봄
        MyPet m1 = MyPet.getInstance();
        MyPet m2 = MyPet.getInstance();
        MyPet m3 = MyPet.getInstance();

        System.out.println("m1 = " + m1);
        System.out.println("m2 = " + m2);
        System.out.println("m3 = " + m3);

        m1.setName("초코");

        m1.introduce();
        m2.introduce();
        m3.introduce();
    }
}
