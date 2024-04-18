package day08.gisa;

public class Child extends Parent{
    private String name;

    public Child() {
        this("홍길동");
        System.out.println("Child() call!");
    }

    public Child(String name) {
        super();
        this.name = name;
        System.out.println("Child(String) call!");
    }

    void aaa(){
        bbb();
        System.out.println("aaa");
    }
    void bbb() {
        System.out.println("bbb");
        ccc();
    }
    void ccc() {
        System.out.println("ccc");
    }
}
