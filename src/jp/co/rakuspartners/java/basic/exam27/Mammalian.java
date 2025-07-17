package jp.co.rakuspartners.java.basic.exam27;

public class Mammalian {
    String name;

    public void showTime(){
        System.out.println("哺乳類です");
    }

    public void showName(){
        System.out.println("私の名前は"+name+"です");
    }

    public void eat(){
        System.out.println("生き物を食べます");
    }

    public void setName(String name){
        this.name = name;
    }


}
