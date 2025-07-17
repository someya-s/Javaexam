package jp.co.rakuspartners.java.basic.kensyu;

public class carclass2 {

    //車のクラス部品用のクラス(フィールド:属性)
    int speed;
    String name;

    //アクセルを踏む(メソッド:操作)

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    carclass2(){

    }

    carclass2(int speed, String name){
        this.speed = speed;
        this.name = name;
    }

    void stepOnAccele(){
        speed += 10;
        System.out.println("スピードが" + speed + "km/hに増えました");
    } 
       
        //ブレーキを踏む
    void stepOnBrake(){
        speed = speed - 10;
        System.out.println("スピードが" + speed + "km/hに減りました");
    }
}
