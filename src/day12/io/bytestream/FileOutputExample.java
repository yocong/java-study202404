package day12.io.bytestream;

import day12.io.FileExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 바이트 기반 출력 스트림 예제 : 영상, 이미지, 텍스트 등 모든 데이터 출력가능
public class FileOutputExample {

    public static void main(String[] args) {

        String message = "멍멍이는 멍멍멍 왈왈왈! 야옹이는 냐냐냥~";

        // try with resource : close가 필요한 하드웨어 접근 코드에 대해
        // 메모리 자원 반납 처리를 자동화해주는 문법

//        FileOutputStream fos = null;
        // try의 ()안에 입력해주는 코드는 자동으로 close해줌 -> finally에 close 할 필요 X
        try (FileOutputStream fos = new FileOutputStream(FileExample.ROOT_PATH + "/hello/pet.txt")) {
//            fos = new FileOutputStream(FileExample.ROOT_PATH + "/hello/pet.txt");
            fos.write(message.getBytes()); // 세이브파일 생성 명령, byte 기반이기 떄문에 byte로 변환
        } catch (FileNotFoundException e) {
            System.out.println("해당 경로를 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("출력 시스템에 장애가 발생했습니다.");
        }
/*        finally { // 예외가 나도 실행, 안나도 실행되는 코드
//                System.out.println("이 코드는 무조건 실행됨!");

            // 파일 입출력과 같은 코드는 하드웨어 직접 접근하는 코드이므로
            // 보통 사용 후 메모리 정리를 해줘야 다음 실행에 문제가 생길 여지가 줄어듬
            try {
                if (fos != null) fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }*/
    }
}
