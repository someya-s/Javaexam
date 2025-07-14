package jp.co.rakuspartners.java.basic.exam15;

public class Human {
    String lastname;
    String firstname;
    int power;

    Human(){

    }

    Human(String lastname,String firstname,int power){
        this.lastname = lastname;
        this.firstname = firstname;
        this.power = power;
    }

    public String toString(){
        return lastname +firstname+"さんのパワーは"+power+"です。";
    }
}
