package day10.inter.quiz;

public class ImageDisplay implements MediaPlayable {
    @Override
    public void play() {
        System.out.println("이미지가 재생됩니다.");
    }

    @Override
    public void pause() {}

    @Override
    public void stop() {

    }
}
