package day10.inter.quiz;

public interface MediaPlayable {

    // 추상메서드 (-> 자식 클래스에서 구현)
    void play(); // 재생
    void pause(); // 일시정지
    void stop(); // 중지
}
