package jp.co.rakuspartners.java.basic.exam3;

public class Ex03 {
    public static void main(String[] args) {
        int priceA = 500;
        int priceB = 350;
        int totalPrice = priceA*4 + priceB*8;
        int tax = totalPrice / 10;
        System.out.println("小計金額");
        System.out.println(totalPrice);
        System.out.println("消費税");
        System.out.println(tax);
        System.out.println("合計金額");
        System.out.println(totalPrice + tax);
    }

}
