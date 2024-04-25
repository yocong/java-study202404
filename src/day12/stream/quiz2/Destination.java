package day12.stream.quiz2;

// 여행 목적지
public class Destination {

    private String city; // 도시명
    private String country; // 나라명

    public Destination(String city, String country) {
        this.city = city;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public String toString() {
        return "Destination{" +
                "city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
