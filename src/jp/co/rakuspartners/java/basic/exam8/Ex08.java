package jp.co.rakuspartners.java.basic.exam8;

public class Ex08 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(b);
        for(int c=1; c<=1000; c=a+b){
            System.out.println(c);
            a = b;
            b = c;
        
        }
    }

}
