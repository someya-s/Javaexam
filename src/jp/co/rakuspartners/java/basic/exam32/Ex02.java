package jp.co.rakuspartners.java.basic.exam32;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("伊賀");
        list.add("山田");
        list.add("佐藤");
        list.add("田中");
        list.remove(1);
        list.add(1, "鈴木");

        System.out.println("3番目の社員は"+list.get(2)+"です");
        
        for(String element: list){
            System.out.println(element);
        }

    }

}
