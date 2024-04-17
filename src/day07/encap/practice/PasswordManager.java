package day07.encap.practice;

public class PasswordManager {

    private String password; // 비밀번호

    // 생성자
    public PasswordManager(String password) {
        this.password = password;
    }


    /**
     * 이 메서드는 비밀번호를 변경해주는 공개된 메서드로서
     * 사용자는 기존에 사용하던 패스워드를 올바르게 전달하고
     * 새롭게 사용할 패스워드를 전달합니다.
     * @param oldPassword - 기존에 사용하던 비밀번호
     * @param newPassword - 새롭게 변경할 비밀번호
     * @return - 변경에 성공하면 true, 실패하면 false
     */
    public boolean changePassword(String oldPassword, String newPassword) {

        if (oldPassword.equals(this.password)) {
            this.password = newPassword;
            return true;
        } else {
            return false;
        }
    }
}
