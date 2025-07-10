package jp.co.rakuspartners.java.basic.exam5;

public class Ex07 {
    public static void main(String[] args) {
        int point = 30;
        if(point < 60){
            System.out.println("NG");
        }else if (point >= 60 && 80 > point) {
            System.out.println("SO SO");
        }else{
            System.out.println("OK");
        }
    }

}
