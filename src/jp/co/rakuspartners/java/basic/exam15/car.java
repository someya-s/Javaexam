package jp.co.rakuspartners.java.basic.exam15;

public class car {

    //車のクラス部品用のクラス(フィールド:属性)
    int speed;
    String name;
    int gasoline;

    car(int speed,String name, int gasoline){
        this.speed = speed;
        this.name = name;
        this.gasoline = gasoline;
    }

        //アクセルを踏む(メソッド:操作)
    void display(){
        System.out.println(name + "は時速" + speed + "km/hでガソリン残量は" + gasoline + "リットルです");
    }

}
