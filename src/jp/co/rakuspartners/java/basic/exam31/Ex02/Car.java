package jp.co.rakuspartners.java.basic.exam31.Ex02;

public class Car {
    private int speed;

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void run(int speed) throws IllegalArgumentException{
        if(speed < 0 || 180 <= speed){
            throw new IllegalArgumentException("スピードの出しすぎです");
        }else{
            System.out.println("スピードは"+speed+"km/hです");
        }

    }

}
