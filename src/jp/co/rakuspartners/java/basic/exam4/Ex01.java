package jp.co.rakuspartners.java.basic.exam4;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex01 {
    public static void main(String[] args) {
        BigDecimal priceA = new BigDecimal("500");
        BigDecimal priceB = new BigDecimal("350");
        BigDecimal totalPrice = priceA.multiply(new BigDecimal("4")).add(priceB.multiply(new BigDecimal("8")));
        BigDecimal taxRate = new BigDecimal("0.10");
        BigDecimal tax = totalPrice.multiply(taxRate).setScale(0, RoundingMode.HALF_UP);
        BigDecimal totalWithTax = totalPrice.add(tax);

        System.out.println("小計金額");
        System.out.println(totalPrice);
        System.out.println("消費税");
        System.out.println(tax);
        System.out.println("合計金額");
        System.out.println(totalWithTax);
    }

}
