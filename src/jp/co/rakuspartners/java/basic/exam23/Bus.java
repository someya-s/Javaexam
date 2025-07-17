package jp.co.rakuspartners.java.basic.exam23;

public class Bus extends Car{

    int price = 0;

    @Override
    void stepOnAccele(){
        super.stepOnAccele();
        // speed += 10;
        // System.out.println("スピードが" + speed + "km/hに増えました");

        price += 30;
        System.out.println("料金が" + price + "円に増えました");        
    } 
           

}
