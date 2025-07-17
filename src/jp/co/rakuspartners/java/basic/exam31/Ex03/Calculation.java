package jp.co.rakuspartners.java.basic.exam31.Ex03;

public class Calculation {
    public static int execute(int firstNum,char operator,int secondNum) throws ArithmeticException{
        switch (operator) {
            case '+':
            return firstNum + secondNum;
            
            case '-':
            return firstNum - secondNum;

            case '*':
            return firstNum * secondNum;

            case '/':
            return firstNum / secondNum;

            default:
                throw new ArithmeticException("無効です");
        }

    }

}
