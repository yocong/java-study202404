package day07.player;

// 상위 클래스 (super class)
// : 공통 속성(field)과 기능(method)을 가진 부모 클래스
public class Player extends Object {

    String nickname;
    int level;
    int hp;

    Player(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
    }

    // 현재 캐릭터 정보를 출력
    public void showStatus() {
        System.out.println("\n======= Character's Info ========");
        System.out.println("# name: " + this.nickname);
        System.out.println("# level: " + this.level);
        System.out.println("# hp: " + this.hp);
    }
}
