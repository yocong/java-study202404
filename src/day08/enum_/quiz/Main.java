package day08.enum_.quiz;

public class Main {

    public static void main(String[] args) {

        TeamMember alice = new TeamMember("Alice", TeamRole.DEVELOPER);
        TeamMember bob = new TeamMember("Bob", TeamRole.DESIGNER);
        TeamMember charlie = new TeamMember("Charlie", TeamRole.LEADER);
        TeamMember david = new TeamMember("David", TeamRole.TESTER);

        alice.assignTask(); // Alice is assigned to Develops the software.
        bob.assignTask();   // Bob is assigned to Designs the user interface.
        charlie.assignTask(); // Charlie is assigned to Manages the team and coordinates.
        david.assignTask();  // David is assigned to Tests the software for bugs.
    }
}
