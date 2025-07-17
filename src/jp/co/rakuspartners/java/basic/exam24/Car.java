package jp.co.rakuspartners.java.basic.exam24;

public class Car {

    //車のクラス部品用のクラス(フィールド:属性)
    protected int speed;
    protected String name;

    //アクセルを踏む(メソッド:操作)

    Car(){

    }

    Car(int speed, String name){
        this.speed = speed;
        this.name = name;
    }

    protected void stepOnAccele(){
        speed += 10;
        System.out.println("スピードが" + speed + "km/hに増えました");
    } 
       
        //ブレーキを踏む
    protected void stepOnBrake(){
        speed -= 10;
        System.out.println("スピードが" + speed + "km/hに減りました");
    }
}
