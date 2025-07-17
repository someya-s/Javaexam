package jp.co.rakuspartners.java.basic.kensyu;

public class Taxi extends carclass2{
   
    int price;

    void payment(){
        System.out.println("料金を"+ price + "円支払いました");
        price = 0;
    }

    @Override
        void stepOnAccele(){

        super.stepOnAccele();
        // speed += 10;
        // System.out.println("スピードが" + speed + "km/hに増えました");
        price += 90;
        System.out.println("料金が" + price + "円に増えました");

    } 

}
