//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(10 + 5);
        System.out.println("안뇽?"); // 백틱 불가능

        int month = 5;
        int day = 5;
        String anni = "어린이날";

        // ln은 line을 뜻함. 줄바꿈 O
        System.out.println(month + "월 " + day + "일은 " + anni + "입니다.");
        // printf는 줄바꿈 X
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);
        System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);
    }
}
