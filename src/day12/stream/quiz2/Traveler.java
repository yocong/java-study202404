package day12.stream.quiz2;

// 여행자
public class Traveler {

    private String name; // 여행자명
    private String email; // 여행자의 이메일

    public Traveler(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Traveler{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
