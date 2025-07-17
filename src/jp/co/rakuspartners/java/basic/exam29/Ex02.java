package jp.co.rakuspartners.java.basic.exam29;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class Ex02 {
    public static void main(String[] args) {
        LocalDate localDate =LocalDate.of(2020, 2, 1);
        int dayOfMonth = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfMonth();
        System.out.println(dayOfMonth);
    }

}
