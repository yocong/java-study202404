package day07.player;

public class Mage extends Player{

    int mana;

    public Mage(String nickName) {
        this.nickname = nickName;
        this.level = 1;
        this.hp = 50;
        this.mana = 100;
    }

    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# mana: " + this.mana);
    }

    public void thunderbolt(Mage...targets) {

    }
}
