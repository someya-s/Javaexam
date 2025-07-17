package jp.co.rakuspartners.java.basic.exam30;

public class Exam2 {
    public static void main(String[] args) {
        try{
            Class.forName("java.lang. java.lang.NotFoundClass");
        }catch(ClassNotFoundException e){
            System.out.println("クラスが見つかりません");
            e.printStackTrace();
        }
    }
}
