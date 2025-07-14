package jp.co.rakuspartners.java.basic.kensyu;

public class InstantiateCar2 {
   public static void main(String[] args) {
        carclass2 car = new carclass2(0,"エスティマ");

        //car.speed = 0;
        //car.name = "エスティマ";

        car.stepOnAccele();
        car.stepOnAccele();
        car.stepOnBrake();

        System.out.println("現在の速度は" + car.speed + "km/hです。");
    }

}
