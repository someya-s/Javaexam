package jp.co.rakuspartners.java.basic.exam14;

public class InstantiateCar {
    public static void main(String[] args) {
        carclass car = new carclass();

        car.speed = 0;
        car.name = "エスティマ";

        car.stepOnAccele();
        car.stepOnAccele();
        car.stepOnBrake();

        System.out.println("現在の速度は" + car.speed + "km/hです。");
    }

}
