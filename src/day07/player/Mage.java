package day07.player;

public class Mage extends Player {

    int mana;

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }

    public void showStatus() {
        super.showStatus();
        System.out.println("# mana: " + this.mana);
    }

    public void thunderbolt(Player... targets) {

        System.out.printf("# %s님 썬더볼트 시전!!!!\n", this.nickname);
        System.out.println("======================================");

        for (Player p : targets) {
            //맞은 사람이 혹시 나??
            if (p == this) continue;

            //10 ~ 15의 랜덤 피해
            int damage = (int) (Math.random() * 6 + 10);
            //실제 체력에서 차감
            p.hp -= damage;
//            p.setHp(p.getHp() - damage);

            System.out.printf("%s님이 %d의 피해를 입었습니다.(남은 체력: %d)\n"
                    , p.nickname, damage, p.hp);
        }


    }
}