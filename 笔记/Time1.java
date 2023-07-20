package com.example.time;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.util.Date;

public class Time1 {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {

            // 创建两个Date对象
            Date date1 = dateFormat.parse("2023-05-01");
            Date date2 = dateFormat.parse("2023-05-08");

            // 计算日期差值（毫秒）
            long timeDifference = date2.getTime() - date1.getTime();

            // 计算日期差值（天数）
            long daysDifference = timeDifference / (1000 * 60 * 60 * 24);

            System.out.println("日期1：" + dateFormat.format(date1));
            System.out.println("日期2：" + dateFormat.format(date2));
            System.out.println("日期差值（天数）：" + daysDifference);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

