package day07.player;

public class Main {

    public static void main(String[] args) {

        /*
                Object
                  |
                Player
             /   |   \
        Warrior Mage Hunter


         */

        Warrior w = new Warrior("주차왕파킹");
        Mage m = new Mage("충격왕쇼킹");
        Hunter h = new Hunter("스티븐호킹");

        w.showStatus();
        m.showStatus();
        h.showStatus();
    }
}
