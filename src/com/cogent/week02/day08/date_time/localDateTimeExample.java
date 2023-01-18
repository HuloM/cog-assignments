package com.cogent.week02.day08.date_time;

import java.time.LocalDateTime;

public class localDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();

        int day = localDateTime.getDayOfMonth();
        int month = localDateTime.getMonthValue();
        int year = localDateTime.getYear();

        System.out.printf("%d-%d-%d", day, month, year);

        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second = localDateTime.getSecond();
        int nanosecond = localDateTime.getNano();

        System.out.printf("%n%d.%d.%d.%d", hour, minute, second, nanosecond);
    }
}
