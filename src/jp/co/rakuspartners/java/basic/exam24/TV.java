package jp.co.rakuspartners.java.basic.exam24;

public class TV {
    private boolean power;
    private int channel;

    TV(){
        power = false;
        channel = 1;
    }

    public void powerOn(){
        power = true;
        System.out.println("電源On");
    }

    public void powerOff(){
        power = false;
        System.out.println("電源Off");
    }

    public void setChannel(int newChannel){
        if(!power){
            System.out.println("電源を入れてください");
            return;
        }
        this.channel = newChannel;
    }

    public void display(){
        if(!power){
        System.out.println("電源を入れてください");
        return;
        }
        
        System.out.println("現在"+channel+"チャンネルを表示しています。");
    }

}
