package jp.co.rakuspartners.java.basic.exam27;

public class Dog extends Mammalian{

    Dog(){
        System.out.println("犬が生まれました");
    }

    @Override
    public void eat(){
        System.out.println("肉を食べます");
    }
}
