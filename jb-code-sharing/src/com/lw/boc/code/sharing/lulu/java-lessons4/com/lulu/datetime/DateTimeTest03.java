package com.lulu.datetime;


import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

/**
 * Duration  用于计算两个“时间”间隔
 * Period    用于计算两个“日期”间隔
 */
public class DateTimeTest03 {

  public static void main(String[] args) throws InterruptedException {

    LocalDateTime now = LocalDateTime.now();

    LocalDateTime localDateTime = LocalDateTime.of(2019, 11, 27, 10, 10, 10);

    System.out.println(Duration.between(localDateTime,now).toMillis()/(1000 * 60 * 60 * 24));
    System.out.println("=====================================");

    Instant instant1 = Instant.now();
    Thread.sleep(1000);
    Instant instant2 = Instant.now();
    System.out.println(Duration.between(instant1,instant2).toMillis());

    System.out.println("=====================================");

    LocalDate localDate1 = LocalDate.now();
    LocalDate localDate2 = LocalDate.now().plusYears(1).plusMonths(1).plusDays(1);

    Period period = Period.between(localDate1, localDate2);
    System.out.println(period.getYears());
    System.out.println(period.getMonths());
    System.out.println(period.getDays());

  }
}
