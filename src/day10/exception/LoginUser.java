package day10.exception;

public class LoginUser {

    private String account; // 가입시 계정명
    private String password; // 가입시 패스워드

    public LoginUser(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public enum LoginStatus {
        SUCCESS, ID_FAIL, PW_FAIL
    }

    // 로그인 검증
    public LoginStatus loginValidate(String inputAccount, String inputPassword) throws InvalidLoginInputException {
        // 아이디가 일치하는가?
        if (!inputAccount.equals(account)) {
            // 상수를 return 하는 것 보다 시스템적으로 훨씬 더 강력하게 알림
            throw new InvalidLoginInputException("계정이 일치하지 않습니다.");
        }

        // 비번이 일치하는가?
        if (!inputPassword.equals(password)) {
            throw new InvalidLoginInputException("비밀번호가 일치하지 않습니다.");
        }

        System.out.println("로그인이 성공했습니다.");
        return LoginStatus.SUCCESS;
    }
}
