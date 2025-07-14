package jp.co.rakuspartners.java.basic.exam13;

public class Ex01 {
    int speed;
    String name;
    int gasoline;

    void stepOnAccele(){
        speed += 10;
        gasoline -= 10;
    }

    void stepOnBrake(){
        speed -= 10;
    }

    void refuel(int newGasoline) {
        gasoline = gasoline + newGasoline;
    }
    
}
