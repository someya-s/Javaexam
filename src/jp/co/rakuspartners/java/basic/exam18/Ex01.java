package jp.co.rakuspartners.java.basic.exam18;

public class Ex01 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        System.out.println("足し算結果: " + calculate.addition(num1, num2));
        System.out.println("引き算結果: " + calculate.subtraction(num1, num2));
        System.out.println("掛け算結果: " + calculate.multiplication(num1, num2));
        System.out.println("割り算結果: " + calculate.division(num1, num2));
        System.out.println("剰余算結果: " + calculate.remainder(num1, num2));
    }
}
