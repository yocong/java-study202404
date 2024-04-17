package day07.encap.practice;

public class Student {

    private String name; // 학생의 이름
    private String studentId; // 학번
    private String department; // 학과

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.equals("")) {
            System.out.println("유효하지않은 이름입니다. ");
            return;
        }
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        if (studentId == null || studentId.equals("")) {
            return;
        }
        this.studentId = studentId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department == null || department.equals("")) {
            return;
        }
            this.department = department;
    }
}
