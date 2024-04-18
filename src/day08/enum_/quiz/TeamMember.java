package day08.enum_.quiz;

public class TeamMember {

    String name; // 팀원 이름
    TeamRole role; // 팀원의 역할

    public TeamMember(String name, TeamRole role) {
        this.name = name;
        this.role = role;
    }

    public void assignTask() {
        System.out.printf("%s is assigned to %s\n", this.name, this.role.getDescription());
    }
}
