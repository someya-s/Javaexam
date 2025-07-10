package jp.co.rakuspartners.java.basic.exam5;

public class Ex08 {
    public static void main(String[] args) {
        int temp = 4;
        int cold = 37;
        int abnormal = 42;
        if(temp < cold){
            System.out.println("正常");
        }else if(cold <= temp && temp < abnormal){
            System.out.println("風邪");
        }else{
            System.out.println("異常");
        }
    }

}
