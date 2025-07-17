package jp.co.rakuspartners.java.basic.exam31.Ex03;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println(Calculation.execute(3,'+',5));

        try{
            System.out.println(Calculation.execute(3,'3',5));
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
    
}
