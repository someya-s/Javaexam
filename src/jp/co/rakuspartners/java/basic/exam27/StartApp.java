package jp.co.rakuspartners.java.basic.exam27;

public class StartApp {
    public static void main(String[] args) {
        Dog dog =new Dog();
        dog.showTime();
        dog.setName("ポチ");
        dog.showName();
        dog.eat();

        Cat cat = new Cat();
        cat.showTime();
        cat.setName("タマ");
        cat.eat();

        Human hum = new Human();
        hum.showTime();
        hum.setName("山田");
        hum.eat();


    }

}
