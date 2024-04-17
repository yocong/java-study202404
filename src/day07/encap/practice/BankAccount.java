package day07.encap.practice;

public class BankAccount {

    private int balance; // 계좌 잔액
    private String accountNumber; // 계좌 번호
    private String accountHolder; // 계좌 주인의 이름


    public BankAccount(String accountNumber, String accountHolder, int balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

//        - 잔액 조회, 입금, 출금 메소드를 public으로 만들어 외부에서 접근할 수 있게 하세요.

    // 잔액 조회
    public int getBalance() {
        return this.balance;
    }

    // 입금 메서드
    public void deposit(int money) {
        if (money < 0) {
            return;
        }
         this.balance += money;
    }

    // 출금 메서드
    // 잔액이 출금하려는 금액보다 클 때만 돈을 출금할 수 있도록 하세요.

    public void withdraw(int money) {
        if (money < 0 || money > balance) {
            return;
        } else {
            this.balance -= money;
        }
    }
}
