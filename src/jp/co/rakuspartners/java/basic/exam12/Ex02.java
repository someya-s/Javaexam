package jp.co.rakuspartners.java.basic.exam12;

public class Ex02 {
    public static void main(String[] args) {
        int price = 2000;

        int tax = calcTax(price);
        int totalPrice =calcIncludTax(price);
        int halfPrice = calcHalfPrice(price);
        int discount = calcTimeServicePrice(price,0.8);

        System.out.println(tax);
        System.out.println(totalPrice);
        System.out.println(halfPrice);
        System.out.println(discount);
    }
    
    public static int calcTax(int price){
        return (int)(price / 10);
    }

    public static int calcIncludTax(int price){
        return (int)(price + calcTax(price));
    }

    public static int calcHalfPrice(int price){
        return (int)(calcIncludTax(price) / 2);
    }

    public static int calcTimeServicePrice(int price,double discountRate){
        return (int)(price * discountRate);
    }

}
