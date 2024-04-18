package day08.static_.quiz1;

public class Department {

    private String departmentName; // 학과 이름
    private int studentCount; // 학과별 학생 수
    private static int totalStudents; // 전체 학생 수



    public Department(String departmentName, int studentCount) {
        this.departmentName = departmentName;
        this.studentCount = studentCount;
        totalStudents += studentCount;
    }

    public void addStudent(int number) {
        this.studentCount += number;
        totalStudents += number;
    }

    public int getStudentCount() {
        return this.studentCount;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}
