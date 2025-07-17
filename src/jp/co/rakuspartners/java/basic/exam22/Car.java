package jp.co.rakuspartners.java.basic.exam22;

public class Car {

    //車のクラス部品用のクラス(フィールド:属性)
    int speed;
    String name;

    //アクセルを踏む(メソッド:操作)

    Car(){

    }

    Car(int speed, String name){
        this.speed = speed;
        this.name = name;
    }

    void stepOnAccele(){
        speed += 10;
        System.out.println("スピードが" + speed + "km/hに増えました");
    } 
       
        //ブレーキを踏む
    void stepOnBrake(){
        speed -= 10;
        System.out.println("スピードが" + speed + "km/hに減りました");
    }
}
