package com.lulu.datetime;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * DateTimeFormatter 时间格式化类
 */
public class DateTimeTest05 {

  public static void main(String[] args) {

    DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ISO_DATE;
    LocalDateTime localDateTime = LocalDateTime.now();
    String strDate1 = localDateTime.format(dateTimeFormatter1);
    System.out.println(strDate1);

    // Date -> String
    DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String strDate2 = dateTimeFormatter2.format(localDateTime);
    System.out.println(strDate2);

    // String -> Date
    LocalDateTime localDateTime1 = LocalDateTime.parse("2019-11-27 18:01:18", dateTimeFormatter2);
    System.out.println(localDateTime1);

  }
}
