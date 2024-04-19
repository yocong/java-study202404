package day09.poly.car;

public class Main {

    public static void main(String[] args) {

        Car sonata1 = new Sonata();
        Car sonata2 = new Sonata();
        Sonata sonata3 = new Sonata();

//        Sonata[] sArr = {sonata1, sonata2, sonata3};
//        for (Sonata sonata : sArr) {
//            sonata.accelerate();
//        }

        Car tucson1 = new Tucson();
        Car tucson2 = new Tucson();

        Car mustang1 = new Mustang();
        Car mustang2 = new Mustang();
        Car mustang3 = new Mustang();
        Car mustang4 = new Mustang();

        // 다형성을 통해 이종모음(<->동종모음) 배열을 구현할 수 있음
        Car[] cArr = {sonata1, tucson1, mustang1, mustang2};
        for (Car car : cArr) {
            car.accelerate();
        }

//        String[] sArr = {"abc", "def", 100, false}; // 에러 (동종모음이기 때문에)
        Object[] sArr = {"abc", "def", 100, false}; // 이종모음여도 가능

        System.out.println("============================");

        Driver driver = new Driver();
        driver.drive(new Tucson());

        Sonata mySonata = new Sonata();
        mySonata.accelerate();
        mySonata.joinSonataClub();

        Car[] cars = new Car[3];
        cars[0] = mySonata;

        System.out.println("==================");

        CarShop shop = new CarShop();

        // 객체타입에서 다운캐스팅의 전제조건: 반드시 상속관계에 있어야 하며
        // 자식객체가 부모타입으로 업케스팅 된 것만 내릴 수 있음
        // 즉, 부모객체를 자식타입으로 내릴 수는 없다.
        Sonata car = (Sonata) shop.exportCar(3000);
        car.accelerate();
        car.joinSonataClub();

        System.out.println("=========================");

        // 부모 -> 자식타입으로 못내림 (다운캐스팅 불가, 조건에 맞는 것만 가능)
//        Sonata ccc = (Sonata) new Car();
//        Mustang mmm = (Sonata) new Mustang();

        // Tucson(자식)이 Car(부모)로 업캐스팅 됐던 것이기 때문에
        // 다시 Tucson(자식)으로 다운캐스팅 가능
        Car ttt = new Tucson();
        Tucson tts = (Tucson) ttt;

        System.out.println("====================");

        driver.drive(new Sonata());
    }
}
