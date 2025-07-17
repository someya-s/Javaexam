package jp.co.rakuspartners.java.basic.exam29;

import java.time.LocalDate;

public class Ex01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1998, 10, 12);

        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int dayOfMonth = localDate.getDayOfMonth();
        System.out.println("私の誕生日は"+ year +"年"+month+"月"+dayOfMonth+"日です");

    }

}
