package jp.co.rakuspartners.java.basic.exam19;

public class Ex13 {
    public static void main(String[] args) {
        Ex13ElectricCar car = new Ex13ElectricCar();

            car.chargeToFull();
            car.powerOn();
            car.move("埼玉");
            car.move("東京");
            car.move("茨城");
            car.powerOn();
            
    }

}
