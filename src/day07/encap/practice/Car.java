package day07.encap.practice;

public class Car {

    private String model; // 자동차 모델명
    private int speed; // 현재 속도
    private char mode; // 변속 모드(D, N, R, P)
    private boolean start; // 시동이 걸린 여부
    private String brand; // 브랜드
    private int year;

    // 생성자
    Car() {
        this.model = null;
        this.speed = 0;
        this.mode = 'P';
        this.start = false;
        this.brand = null;
        this.year = 0;
    }
//    Car() {
//
//    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 2024 ) {
            System.out.println("장난치지 마십쇼");
        } else {
            this.year = year;
        }
    }
    // 엔진에 연료가 주입되는 기능
//    private void injectGasoline() {
//        if (start) {
//            System.out.println("엔진에 연료가 주입됩니다.");
//        } else {
//            System.out.println("시동이 켜지지 않았습니다.");
//            System.out.println("자동차가 폭발합니다.");
//        }
//    }
//
//    // 엔진오일이 순환하는 기능
//    private void moveEngineOil() {
//        System.out.println("엔진오일이 순환합니다.");
//    }
//
//    // 엔진 내부에 있는 실린더가 작동하는 기능
//    private void moveCylinder() {
//        System.out.println("엔진 내부 실린더가 왕복으로 움직입니다.");
//    }
//
//    // 시동 버튼을 누르는 기능
//    public void startStop() {
//        this.start = !this.start; // 기존의 값을 뒤집는 방법
//        if (start) {
//            System.out.println("시동이 켜졌습니다. 운행준비를 시작합니다");
//            injectGasoline();
//            moveEngineOil();
//            moveCylinder();
//        } else {
//            System.out.println("시동이 꺼졌습니다. 다음에 다시 만나요.");
//        }
//    }
//
//    // 현재 속도를 제한하는 메서드
//    // setter 메서드 : private 필드값을 안전하게 설정하기 위한 검증 로직이 포함된 메서드
//    public void setSpeed(int speed) {
//        if (speed < 0 || speed > 200) {
//            this.speed = 0;
//            this.start = false;
//            this.mode = 'P';
//            System.out.println("제한 속도 위반으로 시동이 안전하게 꺼졌습니다.");
//        } else {
//            this.speed = speed;
//        }
//    }
//
//    // 현재 속도값을 가져오는 메서드
//    // 필드의 speed 는 사용자의 접근을 막기위해 private 으로 설정했지만
//    // private 이 걸려있어 대신 public 함수를 만들어서 보여준다.
//    // getter 메서드 : 정보은닉된 필드를 가져오는 대리 메서드
//    public int getSpeed() {
//        return  this.speed;
//    }
//
//    // boolean 필드의 getter 는 이름관례가 다름 is + 필드명
//    public boolean isStart() {
//        return start;
//    }
//
//
//    public char getMode() {
//        return mode;
//    }
//
//    public void setMode(char mode) {
//        switch (mode) {
//            case 'P': case 'N': case 'D': case 'R':
//                this.mode = mode;
//                break;
//            default:
//            this.mode = 'P';
//        }
//    }

}

