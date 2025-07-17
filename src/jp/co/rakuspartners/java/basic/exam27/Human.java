package jp.co.rakuspartners.java.basic.exam27;

public class Human extends Mammalian{

    Human(){
        System.out.println("人が生まれました");
    }

    @Override
    public void eat(){
        System.out.println("野菜を食べます");
    }

}
