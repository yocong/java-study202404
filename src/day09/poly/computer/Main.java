package day09.poly.computer;

public class Main {

    public static void main(String[] args) {

        Desktop myCom = new Desktop(new LgMonitor());
        Desktop friendCom = new Desktop(new HpMonitor());


        myCom.changeMonitor(new HpMonitor());
        myCom.changeMonitor(new LgMonitor());
    }
}
