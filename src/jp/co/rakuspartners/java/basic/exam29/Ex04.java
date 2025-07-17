package jp.co.rakuspartners.java.basic.exam29;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Ex04 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020, 7, 27);
        System.out.println(localDate);
        DateTimeFormatter formatt1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        DateTimeFormatter formatt2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        DateTimeFormatter formatt3 = DateTimeFormatter.ofPattern("yyyy年MM月dd日(E)",Locale.JAPANESE);

        System.out.println(localDate.format(formatt1));
        System.out.println(localDate.format(formatt2));
        System.out.println(localDate.format(formatt3));
    }

}
