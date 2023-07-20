package com.example.time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Time2 {
    public static void main(String[] args) {
        // 创建两个日期对象
        LocalDate date1 = LocalDate.of(2023, 5, 1);
        LocalDate date2 = LocalDate.of(2023, 5, 8);

        // 计算两个日期之间的天数差值
        long daysDifference = Duration.between(date1.atStartOfDay(), date2.atStartOfDay()).toDays();
        System.out.println("日期差值（天数）：" + daysDifference);

        // 创建两个日期时间对象
        LocalDateTime dateTime1 = LocalDateTime.of(2023, 5, 1, 12, 0, 0);
        LocalDateTime dateTime2 = LocalDateTime.of(2023, 5, 8, 15, 30, 0);

        // 计算两个日期时间之间的小时差值
        long hoursDifference = Duration.between(dateTime1, dateTime2).toHours();
        System.out.println("日期时间差值（小时）：" + hoursDifference);
    }
}
