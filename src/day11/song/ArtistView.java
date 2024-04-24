package day11.song;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import static day09.util.SimpleInput.input;

// 프로그램의 입출력 처리 담당
public class ArtistView {

    // repository HashMap으로 초기화
    private static ArtistRepository repository = new ArtistRepository(new HashMap<>());

    // 프로그램 실행
    public static void start() {

        repository.load();

        while (true) {
            showMainScreen();
            String menuNum = input(">> ");

            switch (menuNum) {
                case "1":
                    registerNewSong();
                    break;
                case "2":
                    searchSongInfo();
                    break;
                case "3":
                    System.out.println("프로그램을 종료합니다!");
                    return;
                default:
                    System.out.println("# 올바른 메뉴 번호를 입력하세요!");
            }
        }
    }

    // 메뉴 출력
    private static void showMainScreen() {
        System.out.println("\n********* 음악 관리 프로그램 *********");
        System.out.printf("현재 등록된 가수: %d명\n", repository.getArtistMap().size());
        System.out.println("# 1. 노래 등록하기");
        System.out.println("# 2. 노래 정보 검색");
        System.out.println("# 3. 프로그램 종료");
        System.out.println("=====================================");

    }

    // 노래 등록 기능
    private static void registerNewSong() {

        System.out.println("\n# 노래 등록을 시작합니다.");
        String singer = input("- 가수명: ");
        String song = input("- 노래명: ");


        // 1. 처음 등록되는 가수일 때
        if (repository.getArtistMap().isEmpty() || (!repository.getArtistMap().containsKey(singer))) {
            System.out.printf("# %s님이 신규 등록되었습니다.", singer);
        } else { // 2. 등록된 적 있는 가수일 때
            boolean songAlreadyExist = false; // flag
            // repository.getArtistMap().values()는 Artist타입의 컬렉션, 컬렉션은 for loop 사용가능
            for (Artist artist : repository.getArtistMap().values()) {
                if (artist.getSongList().contains(song)) {
                    songAlreadyExist = true;
                    break;
                }
            }
            // 2-1. 노래가 중복되었을 때
            if (songAlreadyExist) {
                System.out.printf("# [%s]곡은 이미 등록된 노래입니다.", song);
            } else {  // 2-2. 이미 있는 가수에 새로운 노래 추가할 때
                System.out.printf("# %s님의 노래목록에 %s곡이 추가되었습니다.", singer, song);
            }
        }

        // 등록된 내용 세이브파일에 저장하기
        repository.save();

        // 노래 리스트 Set 생성
        Set<String> songSet = new HashSet<>();
        songSet.add(song);

        // 입력된 데이터를 저장 (repository의 artistMap에 저장)
        repository.saveSingerAndSong(new Artist(singer, songSet));
    }

    // 노래 정보 검색 기능
    private static void searchSongInfo() {
        int count = 1;
        System.out.println("\n# 검색할 가수명을 입력하세요.");
        String singer = input("- 가수명: ");

        // artistMap에 가수가 존재하지 않을 때
        if (!repository.getArtistMap().containsKey(singer)) {
            System.out.println("# 해당 가수는 등록되지 않았습니다.");
        } else { // artistMap에 가수가 존재할 때
            System.out.printf("\n# %s님의 노래목록\n", singer);
            System.out.println("==========================");
            // artistmap에서 내가 입력한 가수의 노래 리스트만 모아 놓음
            Set<String> newSongSet = repository.getArtistMap().get(singer).getSongList(); // get(Object key): 주어진 키에 들어있는 "값"을 리턴
            for (String song : newSongSet) {
                System.out.printf("* %d. %s", count, song);
                count++;
            }
        }


    }
}
