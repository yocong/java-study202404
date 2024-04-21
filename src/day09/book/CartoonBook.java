package day09.book;

// 역할: 만화책 정보 1개를 가진 객체
public class CartoonBook extends Book {
    private int accessAge; // 나이 제한

    public CartoonBook() {}

    public CartoonBook(String title, String author, String publisher, int accessAge) {
        super(title, author, publisher);
        this.accessAge = accessAge;
    }

    public int getAccessAge() {
        return accessAge;
    }

    public void setAccessAge(int accessAge) {
        this.accessAge = accessAge;
    }

    @Override
    public String info() {
        return String.format("# 분류: 만화책, %s, 연령제한: %d세", super.info(), accessAge);
    }

}

