package jp.co.rakuspartners.java.basic.exam32.Ex03;

import java.util.ArrayList;
import java.util.List;

public class Ex03 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        
        list.add(new Employee("伊賀",30));
        list.add(new Employee("山田",32));
        list.add(new Employee("佐藤",33));
        list.add(new Employee("田中",34));
        list.remove(1);
        list.add(1, new Employee("鈴木",31));

        System.out.println("3番目の社員は"+list.get(2)+"です");
        
        for(Employee element: list){
            System.out.println(element);
        }
    }

}
