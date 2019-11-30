package com.lulu.datetime;


import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *   -- LocalDateTime
 *   -- LocalDate
 *   -- LocalTime
 *
 *   now：静态方法，根据当前时间创建对象
 *   of：静态方法，根据指定日期/时间创建对象
 *   plusDays,plusWeeks,plusMonths,plusYears：向当前LocalDate 对象添加几天、几周、几个月、几年
 *   minusDays,minusWeeks,minusMonths,minusYears：从当前LocalDate 对象减去几天、几周、几个月、几年
 *   plus,minus：添加或减少一个Duration 或Period
 *   withDayOfMonth,withDayOfYear,withMonth,withYear：将月份天数、年份天数、月份、年份修改为指定的值并返回新的LocalDate 对象
 *   getDayOfYear：获得年份天数(1~366)
 *   getDayOfWeek：获得星期几(返回一个DayOfWeek枚举值)
 *   getMonth：获得月份, 返回一个Month 枚举值
 *   getMonthValue：获得月份(1~12)
 *   getYear：获得年份
 *   until：获得两个日期之间的Period 对象，或者指定ChronoUnits 的数字
 *   isBefore,isAfter：比较两个LocalDate
 *   isLeapYear：判断是否是闰年
 */
public class DateTimeTest01 {

  public static void main(String[] args) {

    LocalDateTime now = LocalDateTime.now();
    System.out.println("当前时间:"+now);

    LocalDateTime localDateTime = LocalDateTime.of(2004, 11, 27, 10, 10, 10);

    System.out.println("指定时间："+ localDateTime);

    LocalDateTime updatTime = localDateTime.minusYears(10).plusMonths(1).minusDays(5)
        .minusHours(1).minusMinutes(1).minusSeconds(1);

    System.out.println("修改后的时间:" + updatTime);

    System.out.println("年:" + now.getYear());
    System.out.println("月:" + now.getMonthValue());
    System.out.println("日:" + now.getDayOfMonth());
    System.out.println("时:" + now.getHour());
    System.out.println("分:" + now.getMinute());
    System.out.println("秒:" + now.getSecond());

    System.out.println("一年过的天数:" + now.getDayOfYear());
    System.out.println("周几:" + now.getDayOfWeek());

    System.out.println("现在时间是否是在update时间之后：" + now.isAfter(updatTime));
    System.out.println("现在时间是否是在update时间之前：" + now.isBefore(updatTime));

    System.out.println("是否是闰年：" +  LocalDate.of(2004,1,1).isLeapYear());
  }
}
