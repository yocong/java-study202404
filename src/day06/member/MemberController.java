package day06.member;

// 역할: 사용자의 메뉴 입력을 분기하는 역할
public class MemberController {

    MemberView mv;

    MemberController() {
        this.mv = new MemberView();
    }

    // 메뉴 입력 분기에 따라 할 일을 나눠주는 기능
    void run() {

        while (true) {
            String menuNum = mv.showProgramMenu();

            switch (menuNum) {
                case "1":
                    mv.inputNewMember();
                    break;
                case "2":
                    break;
                case "3":
                    mv.showMembers();
                    break;
                case "4":
                    break;
                case "5":
                    boolean flag = mv.exitProgram();
                    if (flag) return;
            }
        }
    }
}
