package day08.enum_.quiz;

public enum TeamRole {

    LEADER("Manages the team and coordinates."),
    DEVELOPER("Develops the software."),
    DESIGNER("Designs the user interface."),
    TESTER("Tests the software for bugs.");

    private final String description; // 설명

    TeamRole(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
