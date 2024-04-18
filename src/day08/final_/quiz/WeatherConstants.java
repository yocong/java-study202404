package day08.final_.quiz;

public enum WeatherConstants {

     MAX_TEMPERATURE_ALERT(40.0)
     , MIN_TEMPERATURE_ALERT(-10.0)
     , PRECIPITATION_ALERT(50.0);

     private double numericData;

     private WeatherConstants(double numericData) {
          this.numericData = numericData;
     } // 객체 생성 방지

     public double getNumericData() {
          return numericData;
     }

//          public static final double MAX_TEMPERATURE_ALERT = 40.0; // 최고 기온 경보 기준
//     public static final double MIN_TEMPERATURE_ALERT = 10.0; // 최저 기온 경보 기준
//     public static final double PRECIPITATION_ALERT = 50.0; // 강수량 경보 기준
}
