package day07.player;

public class Hunter extends Player{

    int concentration; // 집중력

    public Hunter(String nickname) {
        this.nickname = nickname;
        this.level = 1;
        this.hp = 50;
        this.concentration = 10;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# concentration: " + this.concentration);
    }

    public void multipleArrow() {

    }
}
