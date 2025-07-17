package jp.co.rakuspartners.java.basic.exam27;

public class Cat extends Mammalian {

    Cat(){
        System.out.println("猫が生まれました");
    }

    @Override
    public void eat(){
        System.out.println("魚を食べます");
    }

}
