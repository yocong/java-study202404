package day08.enum_;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new Pizza();

        pizza.orderPizza();
//        pizza.readyPizza();
//        pizza.deliverPizza();

        System.out.println("pizza.getStatus() = " + pizza.getStatus().getDescription());
        System.out.println("소요 시간: " + pizza.getStatus().getTimeToSetup());
    }
}