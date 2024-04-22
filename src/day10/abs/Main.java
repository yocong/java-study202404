package day10.abs;

import day08.protec.pac2.D;

public class Main {

    public static void main(String[] args) {


        Dog myDog = new Dog();
        Dog myDog1 = new Dog();
        Dog myDog2 = new Dog();

        Cat myCat = new Cat();
        Cat myCat1 = new Cat();
        Cat myCat2 = new Cat();
        Cat myCat3 = new Cat();

        GoldFish goldFish = new GoldFish();

        Pet[] petList = {myDog, myDog1, myCat1, myCat3, goldFish};
        // 추상화가 안됐을 경우 일일히 다운캐스팅 (메서드명이 달라서)
//        for (Pet pet : petList) {
//            if (pet instanceof Dog) {
//                ((Dog) pet).eat();
//            } else if (pet instanceof Cat) {
//                ((Cat) pet).haveMeal();
//            }
//        }

        // 추상화 O
        for (Pet pet : petList) {
            pet.eat();
            pet.sleep();
        }


        // 기능은 같지만 메서드명이 다름 (= 추상화가 잘 안됐다)
        myDog.eat();
        myCat.sleep();
    }
}
