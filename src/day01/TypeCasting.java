package day01;

public class TypeCasting {
    public static void main(String[] args) {

        //  암묵적 형 변환 - 작은 사이즈 -> 큰 사이즈
        byte a = 100; // 1byte
        int b = a; // 4byte, int > byte 이기 때문에 byte 타입인 a는 b에 암묵적 형변환으로 들어갈 수 있음

        System.out.println("b = " + b);

        int c = 1000; // 4
        // 명시적 형 변환 - 큰 사이즈 -> 작은 사이즈
        // 작아지면서 숫자도 변함
        byte d = (byte)c;
        System.out.println("d = " + d);

        int k = 50; // 4byte
        double j = k; // 8byte
        System.out.println("j = " + j);

        double m = 5.567;
        int n = (int)m;
        System.out.println("n = " + n);

        // 암묵적 형 변환 -> upcasting (promotion)
        // 명시적 형 변환 -> down casting
        // -> 명시적 형 변환은 데이터 손실을 일으킬 수 있음.

        int v = 100;
        double z = 5.5;

        // 타입이 다른 데이터의 연산은 작은 쪽을 큰 쪽으로 캐스팅한다.
        double result = v + z;

        float f1 = 3.14F;
        double f2 = 5.5;
        double v1 = f1 - f2;

        // 타입이 다른 데이터의 연산에서 작은쪽으로 캐스팅하고싶으면
        // 작은 쪽 부호로 전체를 묶어줌
        int s = 10;
        double o = 5;
        int r = (int) (s * o);
        System.out.println("r = " + r); // int


        // int 이하의 사이즈를 가진 타입은 연산시 결과가 자동으로 int로 캐스팅
//        char b1 = 'A';
//        char b2 = 'C';

        byte b1 = 100;
        byte b2 = 50;

        int r3 = b1 + b2;
        System.out.println(r3);

        char cc = 'A';
        int plusNum = 3;
        char r4 = (char) (cc + plusNum); // D
        System.out.println("r4 = " + r4);
    }
}
