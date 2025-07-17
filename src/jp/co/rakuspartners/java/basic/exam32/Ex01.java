package jp.co.rakuspartners.java.basic.exam32;

import java.util.ArrayList;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("伊賀");
        list.add("山田");
        list.add("佐藤");
        list.add("田中");

        for(int i=0; i<list.size(); i++){
            String element = list.get(i);
            System.out.println(element);
        }


    }

}
