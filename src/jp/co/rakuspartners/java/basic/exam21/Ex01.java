package jp.co.rakuspartners.java.basic.exam21;

public class Ex01 {
    public static void main(String[] args) {

    Bus bus =new Bus();

    bus.speed = 10;
    bus.name = "プリウス";

    bus.stepOnAccele();
    bus.stepOnBrake();
    bus.stepOnBrake();

    System.out.println("現在の速度は" + bus.speed + "km/hです。");

    }
}
