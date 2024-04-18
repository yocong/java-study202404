package day08.static_.quiz2;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("노트북", 1000000);
        Product product2 = new Product("스마트폰", 500000);
        Product product3 = new Product("청소기", 1000000000);

        product1.sellProduct();
        for (int i = 0; i < 4; i++) {
        product2.sellProduct();
        }
        product3.sellProduct();

        System.out.println("총 판매액: " + Store.getTotalSales());
    }
}
