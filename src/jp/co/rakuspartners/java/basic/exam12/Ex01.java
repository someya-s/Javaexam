package jp.co.rakuspartners.java.basic.exam12;

public class Ex01 {
    public static void main(String[] args) {
        int result = amount(10);
        System.out.println(result);
    }
    public static int amount(int n){
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum+i;
        }
        return sum;
    }

}
