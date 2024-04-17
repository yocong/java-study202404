package day07.encap;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("그랜져");

//        myCar.model = "페라리 488"; // 모델명 못바꾸게해야함

        myCar.startStop();

        // 속도 0 ~ 200km 로만 제한 - private으로 하게되면 0 ~ 200 설정도 못함
        // -> setter 생성
        myCar.setSpeed(600);
//        myCar.start = false;
        // private으로 제한해서 못가져오기 때문에 getter를 통해서 가져옴
//        System.out.println("현재 속도: " + myCar.speed + "km/h");
        System.out.println("현재 속도: " + myCar.getSpeed() + "km/h");

        // 변속 모드
        // 변속 모드는 P만으로 제한
        myCar.setMode('N');
        System.out.println("현재 변속 모드: " + myCar.getMode());
    }
}
