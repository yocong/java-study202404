package day07.encap.practice;

public class Product {

    private String name; // 제품 이름
    private int price; // 가격
    private int stock; // 재고 수량

// - 재고를 감소시키는 메소드는 재고가 요청 수량보다 많을 때만 작동하도록 하세요.

    public void reduceStock(int quantity) {
        if (quantity < 0 || stock < quantity) {
            return;
        }
        stock -= quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


}
