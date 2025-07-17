package jp.co.rakuspartners.java.basic.exam31.Ex02;

public class Ex02 {
    public static void main(String[] args) {
        Car car = new Car();

        car.run(40);
        try{
        car.run(200);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
