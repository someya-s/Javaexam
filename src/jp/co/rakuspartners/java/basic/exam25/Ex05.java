package jp.co.rakuspartners.java.basic.exam25;

public class Ex05 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setSpeed(30);
        car.setName("エスティマ");

        System.out.println(car.getSpeed());
        System.out.println(car.getName());
    }

}
