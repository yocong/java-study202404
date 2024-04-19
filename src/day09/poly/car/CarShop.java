package day09.poly.car;

public class CarShop {

    // 돈을 주면 자동차를 출고하는 기능
    // return 타입을 Car로 받게되면 모두 return 가능
    public Car exportCar(int money) {
        if (money == 6000) {
            return new Mustang();
        } else if (money == 4000) {
            return new Tucson();
        } else if ( money == 3000) {
            return new Sonata();
        } else {
            return null;
        }
    }
}
