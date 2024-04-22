package day10.exception;

public class Main {

    public static void main(String[] args) {

        ThrowsExample te = new ThrowsExample();

//        int n = te.inputNumber();
//        System.out.println("n = " + n);

//        try {
//            int n = te.convert("550!!");
//            System.out.println("n = " + n * 2);
//        } catch (NumberFormatException e) {
//            System.out.println("내 입맛대로 예외처리 해서 사용했다.");
//        }

        LoginUser user = new LoginUser("abc1234", "1234");
        try {
            // 틀리면 상수 return 정도였는데 에러가 뜨는 상황을 만들었기 때문에
            // 예외처리 해야됨
            user.loginValidate("abc12314", "12314");
        } catch (InvalidLoginInputException e) {
            System.out.println(e.getMessage());
            e.printStackTrace(); // 에러 로그 출력
        }
    }
}
