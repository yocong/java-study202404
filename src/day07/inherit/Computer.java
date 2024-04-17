package day07.inherit;

public class Computer extends Calculator {

    @Override
    public double calcAreaCircle(int r) {
        return r * r * Math.PI;
    }
}
