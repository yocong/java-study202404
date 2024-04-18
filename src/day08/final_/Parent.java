package day08.final_;

class Child extends Parent {
    @Override
    void sing() {
        System.out.println("비비크림 빠빠빠");
    }

//    @Override
//    void dance() {
//        System.out.println("춤을 핑팡퐁");
//    }
}

public class Parent {

     void sing() {
        System.out.println("노래를 랄라라");
    }
    protected final void dance() {
        System.out.println("댄스를 하하호호");
    }
}
