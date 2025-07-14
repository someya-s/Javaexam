package jp.co.rakuspartners.java.basic.exam17;

public class Ex02 {
    public static void main(String[] args) {
        int[] numbers = {5,6,1,3,9};

        System.out.print(numbers[3]);
        System.out.println();

        for(int number:numbers){
            System.out.print(number);
        }
        System.out.println();

        for(int i=4; i>=0; i--){
            System.out.print(numbers[i]);
        }
        System.out.println();

        for(int i=0; i<5; i++){
            if(numbers[i]%2 == 0){
                continue;
            }
            System.out.print(numbers[i]);
        }
        System.out.println();

        int count=0;
        for(int num:numbers) {
            if(num % 2 == 0){
                count++;
            }
        }
        System.out.println(count);

    int max = numbers[0];
    int min = numbers[0];

    for (int num : numbers) {
        if (num > max) {
            max = num;
        }
        if (num < min) {
            min = num;
        }
    }
    System.out.println("最大値: " + max + "/最小値: " + min);




        
    }

}
