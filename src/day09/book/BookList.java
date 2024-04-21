package day09.book;

public class BookList {

    // Book 클래스의 객체만 포함 될 수 있는 Book 배열을 필드로 등록
    private Book[] bArr;

    private static final int NOT_FOUND = -1;

    public BookList() {
        this.bArr = new Book[0]; // 빈 배열로 초기화
    }

    // 맨 끝에 추가
    void push(Book newBook) {
        Book[] temp = new Book[this.bArr.length + 1];
        for (int i = 0; i < this.bArr.length; i++) {
            temp[i] = this.bArr[i];
        }
        temp[temp.length - 1] = newBook;
        this.bArr = temp;
    }

    // 맨 끝 제거
    private Book pop() {
        // 맨 끝 책 백업
        Book lastBook = bArr[bArr.length - 1];
        Book[] temp = new Book[bArr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = bArr[i];
        }
        bArr = temp;
        return lastBook;
    }

    // 책 정보 삭제
    public Book remove(int index) {
        // 삭제 대상 백업
        Book removedBook = bArr[index];
        for (int i = index; i < bArr.length - 1; i++) {
            bArr[i] = bArr[i + 1];
        }
        pop();
        return removedBook;
    }

    // 배열에 저장된 요소 수 리턴
    int size() {
        return bArr.length;
    }


    // 배열 리턴
    public Book[] getbArr() {
        return bArr;
    }

    // 한 개의 책의 정보 얻기
    public Book get(int index) {
        return bArr[index];
    }
}

