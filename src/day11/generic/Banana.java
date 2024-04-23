package day11.generic;

public class Banana {

    private int sweet; // 당도

    public Banana(int sweet) {
        this.sweet = sweet;
    }

    @Override
    public String toString() {
        return "Banana{" +
                "sweet=" + sweet +
                '}';
    }
}
