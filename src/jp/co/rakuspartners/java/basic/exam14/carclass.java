package jp.co.rakuspartners.java.basic.exam14;

public class carclass {

    //車のクラス部品用のクラス(フィールド:属性)
    int speed;
    String name;

        //アクセルを踏む(メソッド:操作)
    void stepOnAccele(){
        speed = speed + 10;
        System.out.println("スピードが" + speed + "km/hに増えました");
    } 
        
        //ブレーキを踏む
    void stepOnBrake(){
        speed = speed - 10;
        System.out.println("スピードが" + speed + "km/hに減りました");
    }
        

}
