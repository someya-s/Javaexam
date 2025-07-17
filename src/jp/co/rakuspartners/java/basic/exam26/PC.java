package jp.co.rakuspartners.java.basic.exam26;

public class PC implements Electrical{
    boolean powerOn;

    public boolean isPowerOn() {
        return powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    @Override
    public void power() {
        if (powerOn) {
            System.out.println("電源をOFFにする");
            System.out.println("「PCの電源が切れました」");
            powerOn = false;
        } else {
            System.out.println("「設定ファイルを読み込んでいます」");
            powerOn = true;
            System.out.println("「PCの電源が入りました」");
        }
    }

}
