package day12.io.textstream;

// 텍스트 기반 스트림: 텍스트 입출력에 특화된 스트림으로
// 2바이트 이상 데이터를 처리 가능

import day11.util.SimpleInput;
import day12.io.FileExample;

import java.io.FileWriter;

// 바이트 기반 스트림: OutputStream, InputStream
// 텍스트 기반 스트림: Writer, Reader
public class FileWriterExample {

    public static void main(String[] args) {

        String targetPath = FileExample.ROOT_PATH + "/hello/hobby.txt";

        try (FileWriter fw = new FileWriter(targetPath)) {
            String hobby = SimpleInput.input("취미를 입력하세요!!\n>>");
            String outputMessage = String.format("내 취미는 %s입니다.\n", hobby);

            // 파일 생성 명령
            fw.write(outputMessage);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
