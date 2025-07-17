package jp.co.rakuspartners.java.basic.exam31;

public class Ex01 {
    public static void main(String[] args) {
        try{
            method1();
        }catch(ClassNotFoundException e){
            System.out.println("クラスが見つかりません");
            e.printStackTrace();
        }
    }

    public static void method1() throws ClassNotFoundException {
            Class.forName("java.lang.NonExistClass");
        }

}
