package day01;

public class TypeCasting {
    public static void main(String[] args) {

        //  암묵적 형 변환 - 작은 사이즈 -> 큰 사이즈
        byte a = 100; // 1byte
        int b = a; // 4byte

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
    }
}
