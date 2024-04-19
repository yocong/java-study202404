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

        System.out.println("=========================");

        // 썬더볼트는 여러 플레이어를 대상으로 공격하는 스킬이다.
        // 1. 자기 자신이 대상이되면 자기 자신은 피해를 입지 않는다.
        // 2. 타겟이 된 대상은 10 ~ 15의 랜덤 피해를 입고 실제로 체력이 감소한다.

        m.thunderbolt(w, h, m, new Mage("토끼곤듀"), new Warrior("딸기공주"));
    }
}
