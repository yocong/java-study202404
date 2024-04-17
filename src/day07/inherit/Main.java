package day07.inherit;

public class Main {

    public static void main(String[] args) {

//        Calculator cal = new Calculator();
//        Computer com = new Computer();
//
//        System.out.println("계산기로 구한 원의 넓이: " + cal.calcAreaCircle(5));
//        System.out.println("컴퓨터로 구한 원의 넓이: " + com.calcAreaCircle(5));

        // Main 클래스와 main 메소드
        Television tv = new Television("Samsung TV", 2000000, "Samsung", 55);
        Smartphone phone = new Smartphone("iPhone 13", 890000, "Apple", 256);

        System.out.println("TV Info:");
        tv.displayInfo();

        System.out.println("\nSmartphone Info:");
        phone.displayInfo();
    }
}
