package day09.poly.car;

public class Sonata extends Car {

    // Car 상속받으면 Override됨
    @Override
    public void accelerate() {
        System.out.println("소나타가 달립니다.");
    }

    // 소나타 동호회에 가입하는 기능
    public void joinSonataClub() {

    }
}
