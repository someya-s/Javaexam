package jp.co.rakuspartners.java.basic.exam33;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex01 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("東京","東京");
        map.put("埼玉","さいたま");
        map.put("茨城","水戸");
        map.put("沖縄","那覇");

        System.out.println(map.get("埼玉"));
        System.out.println(map.get("沖縄"));

        Set<String> keySet = map.keySet();
        for(String key : keySet){
            System.out.println(map.get(key));
        }



        


    }

}
