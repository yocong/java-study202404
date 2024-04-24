package day12.io.obj;

import day12.io.FileExample;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class LoadSnack {

    public static void main(String[] args) {

        // 세이브 파일 로딩하기
        try (FileInputStream fis = new FileInputStream(FileExample.ROOT_PATH + "/hello/snack.sav")) {

            // 객체를 로딩할 보조 스트림
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Snack> snackList = (List<Snack>) ois.readObject();

            System.out.println("snackList = " + snackList);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
