package jp.co.rakuspartners.java.basic.exam14;

public class Ex03 {
    public static void main(String[] args) {
        Human a = new Human();

        a.lastname = "山田";
        a.firstname = "太郎";

        a.sayMyName();
        a.eat("おにぎり");

        Human b = new Human();

        b.lastname = "佐藤";
        b.firstname = "一郎";

        b.sayMyName();
        b.eat("カレー");


        
    }

}
