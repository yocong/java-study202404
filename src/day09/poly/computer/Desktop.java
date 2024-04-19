package day09.poly.computer;

public class Desktop {

    // 다형성은 객체의 교환성을 높여주며
    // 객체가 특정 부품객체에 종속되지 않도록(의존하지 않게) 하게 해준다.
    Monitor monitor;

    public Desktop(Monitor monitor) {
        this.monitor = monitor;
    }

    public void changeMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
