package day09.book;

import day03.member.Gender;

// 역할: 1명의 도서관 회원정보를 가진 객체
public class BookUser {

    private String name; // 도서관 회원 이름
    private int age; // 도서관 회원 나이
    private Gender gender; // 성별
    private int couponCount; // 쿠폰 갯수
    private Book[] rentBookList; // 빌린 책 정보들

    public BookUser() {
    }

    public BookUser(String name, int age, Gender gender, int couponCount) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.couponCount = couponCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }
    public String getGenderToString() {
        return getGender() == Gender.MALE ? "남성" : "여성";
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getCouponCount() {
        return couponCount;
    }

    public void setCouponCount(int couponCount) {
        this.couponCount = couponCount;
    }
}

