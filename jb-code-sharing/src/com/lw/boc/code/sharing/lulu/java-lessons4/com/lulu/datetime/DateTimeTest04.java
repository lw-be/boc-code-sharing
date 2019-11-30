package com.lulu.datetime;


import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;

/**
 * TemporalAdjuster  时间校正器
 * TemporalAdjusters  TemporalAdjuster的实现
 */
public class DateTimeTest04 {

  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    // 一月中最后一个 周几 是哪天
    System.out.println(now.with(TemporalAdjusters.lastInMonth(DayOfWeek.MONDAY)));
    // 一月中第一个 周几 是哪天
    System.out.println(now.with(TemporalAdjusters.firstInMonth(DayOfWeek.SATURDAY)));
    // 下一个 周几 是哪天
    System.out.println(now.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
  }
}
