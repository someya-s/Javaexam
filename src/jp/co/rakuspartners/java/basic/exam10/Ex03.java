package jp.co.rakuspartners.java.basic.exam10;

public class Ex03 {
    public static void main(String[] args) {
        triangle(20, 50);
    }
    static void triangle(int base,int height){
        int trianglearea = base * height / 2;
        System.out.println(trianglearea);
    }
}
