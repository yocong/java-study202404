package day09.poly.car;

public class Driver {

    // Car타입으로 받으면 다형성을 통해 모두 연결 가능
    public void drive(Car car) {

        String carName = "";
        if (car instanceof Sonata) {
            carName = "쏘나타";
        } else if (car instanceof Tucson) {
            carName = "투싼";
        } else if (car instanceof Mustang) {
            carName = "머스탱";
        }
        // car가 Sonata냐? (boolean)
        System.out.println(car instanceof Sonata);
        System.out.println("운전을 시작합니다.");
        car.accelerate();
    }


}
