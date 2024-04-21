package day09.poly.car;

public class Driver {

    // Car타입으로 받으면 다형성에 의해서 Mustang, Sonata, Tucson 모두 올 수 있음
    // 다형성이 안된다면 Car car 자리에 Sonata sonata, Tucson tuscon처럼 일일히 만들어줘야 했을 것이다.
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
