package jp.co.rakuspartners.java.basic.exam29;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Ex05 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2020, 07, 24);
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日(E)",Locale.JAPANESE);

        System.out.println(localDate.format(formatter1));

        LocalDate birthDate = LocalDate.of(1998, 10, 12);
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy年MM月dd日(E)",Locale.JAPANESE);
        System.out.println(birthDate.format(formatter2));
    }

}
