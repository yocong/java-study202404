//package day01;
//
//public class DataType {
//    public static void main(String[] args) {
//        // 1byte == 8bit
//        // 1bit == 숫자 0 or 1 저장가능
//        // 0 1111111 => 64 + 32 + 16 + 8 + 4 + 2 + 1 == 127
//        byte a = 127; // 1byte
//        short b = 32767; // 2byte
//
//        int c = 2147483647; // 4byte
//
//        long d = 2147483647123123123L; // 8byte
//        System.out.println(d);
//
//        float e = 3.14123123124124F; // 4byte
//        double f = 3.141252341234123; // 8byte
//        double g = 100;
//        System.out.println("e = " + e); // soutv - 변수 값 찍어볼 때
//        System.out.println("f = " + f);
//        System.out.println("g = " + g);
//        // 정수는 주로 int, 실수는 double써
//
//        boolean flag1 = true;
//        boolean flag2 = 10 > 5;
//        System.out.println("flag2 = " + flag2);
//        int i = 100;
//        double v = 5.5;
//        String ctrlAltV = "ctrlAltV";
//
//        double random = Math.random();
//
//        int x = 200;
//        System.out.println(x + a);
//        System.out.println(b * x);
//
//        // 문자형 char : 2byte 0 ~ 65536
//        char text = 610;
//        System.out.println("text = " + text);
//
//        // 문자열 : 문자 배열
//        char[] hello = {'안', '녕', '하', '세', '요'};
//        System.out.println("hello = " + new String(hello));
//
//        String hello2 = "안녕하세요";
//    }
//}
