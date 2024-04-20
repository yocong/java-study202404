package day05.player;

public class Player {

    // 필드
    String nickName;
    int level;
    int hp;

    // 생성자: 객체가 만들어질 때 초기에 어떤값을 가질지를 정하는 곳
    // 생성자는 생성자 내부에서 또다른 생성자를 호출할 수 있음 -> this()
    public Player() {
        // this()로 다른 생성자를 부를때는 생성자당 1번씩만 가능
        // 그리고 가장 첫 줄에 써야 함
        this("이름없는캐릭터", 1, 50); // 4번 생성자 호출!
        System.out.println("1번 생성자 호출!");
    }

    Player(String nickName) {
//        this.nickName = nickName;
        this(nickName, 1); // 3번 생성자 호출!
        System.out.println("2번 생성자 호출!");
        // 필드에는 this. 을 붙여서 만약에 지역변수와 이름이 똑같을 때 구분 가능
    }

    public Player(String nickName, int level) {
        this("이름없는캐릭터", 1, 50); // 4번 호출
        System.out.println("3번 생성자 호출!");
    }

    public Player(String nickName, int level, int hp) {
        System.out.println("4번 생성자 호출!");
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
    }




    // 메서드
    void attack(Player target) {
        System.out.println("this = " + this);
        System.out.println("target = " + target);
        // 맞은 player가 체력을 10 감소시킬 것임
        target.hp -= 10;
        // 때린 player의 체력을 3 감소시킴
        this.hp -= 3;

        System.out.printf("%s 님이 %s님을 공격했습니다.\n", this.nickName, target.nickName);
        System.out.printf("%s 님의 남은 체력: %d\n", this.nickName, this.hp);
        System.out.printf("%s 님의 남은 체력: %d\n", target.nickName, target.hp);
    }
}
