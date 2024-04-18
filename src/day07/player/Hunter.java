package day07.player;

public class Hunter extends Player{

    int concentration; // 집중력

    public Hunter(String nickname) {
        super(nickname);
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
