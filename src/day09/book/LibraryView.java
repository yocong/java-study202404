package day09.book;

import day03.member.Gender;

import static day09.util.SimpleInput.input;

// 역할: 도서관리 프로그램에서 "입출력"을 담당하는 객체
public class LibraryView {

    // 협력
    private LibraryRepository repository;

    public LibraryView() {
        this.repository = new LibraryRepository();
    }

    // 회원 정보를 입력받는 기능
    public void makeNewBookUser() {
        System.out.println("\n# 회원 정보를 입력해주세요.");
        String name = input("# 이름: ");
        int age = Integer.parseInt(input("# 나이: "));
        Gender gender = inputGender();

        // 입력된 데이터를 저장 (repository의 user에게 저장)
        repository.saveBookUser(new BookUser(name, age, gender, 0));
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }

    // 성별을 정확히 입력할때까지 무한히 입력받고 (while)
    // 정확히 입력하면 해당 성별 문자를 리턴
    private Gender inputGender() {
        while (true) {
            String gender = input("# 성별(M/F): ").toUpperCase(); // 소문자로 입력해도 대문자로 바꿔줌
            if (gender.startsWith("M")) return Gender.MALE;
            if (gender.startsWith("F")) return Gender.FEMALE;
            System.out.println("\n# 성별을 잘못 입력했습니다.");
        }
    }

    // 메뉴를 출력하는 기능
    void showMainScreen() {
        System.out.println("\n============ 도서 메뉴 ==============");
        System.out.println("# 1. 마이페이지");
        System.out.println("# 2. 도서 전체 조회");
        System.out.println("# 3. 도서 제목으로 검색");
        System.out.println("# 4. 도서 대여하기");
        System.out.println("# 9. 프로그램 종료하기");
    }

    // 코드의 흐름을 캡슐화
    public void start() {
        makeNewBookUser();

        while (true) {
            showMainScreen();
            String menuNum = input("- 메뉴 번호: ");

            switch (menuNum) {
                case "1":
                    displayMyPage();
                    break;
                case "2":
                    displayAllBooks();
                    break;
                case "3":
                    searchBookTitle();
                    break;
                case "4":
                    rentBook();
                    break;
                case "9":
                    System.out.println("프로그램을 종료합니다!");
                    return;
                default:
                    System.out.println("# 올바른 메뉴 번호를 입력하세요!");
            }
        }
    }

    // 마이페이지 출력
    private void displayMyPage() {
        // repository에 저장했던 user의 정보를 getter를 통해 불러옴
        BookUser user = repository.getUser();
        System.out.println("\n========= 회원님 정보 ===========");
        System.out.printf("\n# 회원명: %s", user.getName());
        System.out.printf("\n# 나이: %d", user.getAge());
        System.out.printf("\n# 성별: %s", user.getGenderToString());
        System.out.printf("\n# 쿠폰개수: %d", user.getCouponCount());
    }

    // 전체 도서 정보를 출력
    private void displayAllBooks() {
        System.out.println("\n========== 전체 도서 목록 ===========");
        // repository에서 가져옴
        Book[] informationList = repository.getAllBooksInfo();

        for (int i = 0; i < informationList.length; i++) {
            Book book = informationList[i];
            System.out.printf("%d.%s\n", i + 1, book.info());
        }
    }

    // 책 제목으로 검색어가 포함된 책 내용 출력
    private void searchBookTitle() {
        String keyword = input("# 검색어: ");

        Book[] searchBooks = repository.searchBookList(keyword);

        if (searchBooks.length > 0) {
            System.out.printf("\n========= [%s] 검색 결과 =========\n", keyword);
            for (Book searchBook : searchBooks) {
                System.out.println(searchBook.info());
            }
        } else {
            System.out.println("\n# 검색 결과가 없습니다.");
        }
    }

    //
    private void rentBook() {
        displayAllBooks();
        String bookNum = input("- 대여할 도서 번호 입력: ");
        // 저장소에다가 대여가능한지 여부 검증
        RentStatus status = repository.rentBook(Integer.parseInt(bookNum));

        if (status == RentStatus.RENT_SUCCESS_WITH_COUPON) {
            System.out.println("# 성공적으로 요리책이 쿠폰발급과 함께 대여되었습니다.");
        } else if (status == RentStatus.RENT_SUCCESS) {
            System.out.println("# 도서가 성공적으로 대여되었습니다.");
        } else {
            System.out.println("# 도서 대여에 실패했습니다.");
        }

    }
}


