package jp.co.rakuspartners.java.basic.exam8;

public class Ex09 {
    public static void main(String[] args) {
        for(int i=1; i<=3; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int k=2; k>=1; k--){
            for(int l=1; k>=l; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
