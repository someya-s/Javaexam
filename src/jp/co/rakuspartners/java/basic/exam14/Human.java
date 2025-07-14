package jp.co.rakuspartners.java.basic.exam14;

public class Human {
    String lastname;
    String firstname;
    int power;

    void sayMyName(){
        System.out.println(lastname +firstname);
    }

    void eat(String food){

        if (food.equals("おにぎり")){
            power += 10;
            System.out.println("おにぎりもぐもぐ");
        }else if(food.equals("カレー")){
            power += 20;
            System.out.println("カレーもぐもぐ");
        }else{
            power += 5;
            System.out.println("なにかをもぐもぐ");
        }
        System.out.println("パワーは"+ power +"になりました。");
    }
}
