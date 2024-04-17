package day07.inherit;

// 상위 클래스
public class ElectronicProduct {

    String productName;
    int price;
    String manufacturer;

    public void displayInfo() {
        System.out.printf("%s, 가격: %d원, 제조사: %s\n",
                this.productName, this.price, this.manufacturer);
    }
}
