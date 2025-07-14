package jp.co.rakuspartners.java.basic.exam16;

public class TV {
    boolean power;
    int channel;

    TV(){
        power = false;
        channel = 1;
    }

    void powerOn(){
        power = true;
        System.out.println("電源On");
    }

    void powerOff(){
        power = false;
        System.out.println("電源Off");
    }

    void setChannel(int newChannel){
        if(!power){
            System.out.println("電源を入れてください");
            return;
        }
        this.channel = newChannel;
    }

    void display(){
        if(!power){
        System.out.println("電源を入れてください");
        return;
        }
        
        System.out.println("現在"+channel+"チャンネルを表示しています。");
    }

}
