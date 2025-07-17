package jp.co.rakuspartners.java.basic.kensyu;

public class InstantiateTaxi {
   public static void main(String[] args) {
        Taxi taxi = new Taxi();

        taxi.speed = 10;
        taxi.name = "タクシー仕様のプリウス";
        taxi.price = 1000;

        taxi.stepOnAccele();
        taxi.stepOnBrake();
        taxi.stepOnBrake();
        System.out.println("現在の速度は" + taxi.speed + "km/hです。");
        taxi.payment();
    }


}
