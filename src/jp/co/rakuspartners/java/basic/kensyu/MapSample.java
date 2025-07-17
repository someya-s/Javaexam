package jp.co.rakuspartners.java.basic.kensyu;

import java.util.HashMap;
import java.util.Map;

import jp.co.rakuspartners.java.basic.exam32.Ex03.Employee;

public class MapSample {
    public static void main(String[] args) {
        Map<String,Employee> map = new HashMap<>();

        map.put("ID001",new Employee("有賀",10));
        map.put("ID002",new Employee("伊賀",30));
        map.put("ID003",new Employee("宇賀",18));

        Employee employee = map.get("ID002");
        if(employee != null){
            System.out.println(employee);
        }
    }

}
