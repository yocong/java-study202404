package day11.song;

import java.util.Map;

// 가수객체 여러개를 관리 (조회, 수정, 삭제, 생성, 탐색, 정렬 ...)
public class ArtistRepository {

    // 가수들을 담을 자료구조 선언
    // key: 가수이름, value: 가수 객체(가수명, 노래리스트)
    private Map<String, Artist> artistMap; // 가수들을 담을 배열

    public ArtistRepository(Map<String, Artist> artistMap) {
        this.artistMap = artistMap;
    }



    public Map<String, Artist> getArtistMap() {
        return artistMap;
    }

    public void setArtistMap(Map<String, Artist> artistMap) {
        this.artistMap = artistMap;
    }

    // 저장소에 가수이름, 가수 객체를 저장
    public void saveSingerAndSong(Artist artist) {
        artistMap.put(artist.getArtistName(), artist);
    }

    // 가수 정보 생성

    // 가수 정보 탐색
}
