package day07.encap.practice;


public class Main {
    public static void main(String[] args) {
        // BankAccount 클래스 테스트
        BankAccount myAccount = new BankAccount("123-456-789", "김철수", 10000);
        System.out.println("현재 잔액: " + myAccount.getBalance());
        myAccount.deposit(50000);
        System.out.println("입금 후 잔액: " + myAccount.getBalance()); // 60000 출력
        myAccount.withdraw(20000);
        System.out.println("출금 후 잔액: " + myAccount.getBalance()); // 40000 출력

        // PasswordManager 클래스 테스트
        PasswordManager pm = new PasswordManager("oldPassword123");
        boolean isChanged = pm.changePassword("oldPassword123", "newPassword123");
        System.out.println("Password changed: " + isChanged); // true

        // Student 클래스 테스트
        Student student = new Student();
        student.setName("박영희");
        student.setStudentId("S001");
        student.setDepartment("Computer Science");
        System.out.println("학생 이름: " + student.getName());
        System.out.println("학번: " + student.getStudentId());
        System.out.println("전공: " + student.getDepartment());

        // Car 클래스 테스트
        Car myCar = new Car();
        myCar.setBrand("현대");
        myCar.setModel("그랜져");
        myCar.setYear(2020);
        System.out.println("Car Brand: " + myCar.getBrand());
        System.out.println("Car Model: " + myCar.getModel());
        System.out.println("Car Year: " + myCar.getYear());

        // Product 클래스 테스트
        Product product = new Product();
        product.setName("Laptop");
        product.setPrice(1200000);
        product.setStock(30);
        System.out.println("상품명: " + product.getName());
        System.out.println("상품 가격: " + product.getPrice());
        System.out.println("재고 수량: " + product.getStock());
        product.reduceStock(5);
        System.out.println("판매 후 수량: " + product.getStock());
    }
}
