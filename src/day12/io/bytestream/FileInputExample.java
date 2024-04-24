package day12.io.bytestream;

import day12.io.FileExample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 바이트 기반 출력 스트림 예제 : 영상, 이미지, 텍스트 등 모든 데이터 출력가능
public class FileInputExample {

    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream(FileExample.ROOT_PATH + "/hello/pet.txt")) {

            int data = 0; // 세이브파일 로드 명령
            while ((data = fis.read()) != -1) {

                // write() : 아스키코드를 문자로 출력
                System.out.write(data);
            }
            // 출력 버퍼 비우기
            System.out.flush();

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
