package day08.static_.quiz2;

public class Store {

    private static int totalSales; // 총 판매액

    static void addSale(int price) {
        totalSales += price;
    }

    public static int getTotalSales() {

        return totalSales;
    }
}
