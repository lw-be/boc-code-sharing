package com.lulu.datetime;


import java.time.Instant;
import java.time.ZoneOffset;
import java.util.Date;


/**
 * Instant 用于“时间戳”的运算。它是以Unix元年(传统的设定为UTC时区1970年1月1日午夜时分)开始所经历的描述进行运算
 */
public class DateTimeTest02 {

  public static void main(String[] args) throws InterruptedException {
    Instant now = Instant.now();
    System.out.println("当前时间:" + now);

    System.out.println("Instant.now().getEpochSecond() :" + now.getEpochSecond());
    System.out.println("Instant.now().toEpochMilli()   :" + now.toEpochMilli());
    Thread.sleep(1000);
    System.out.println("System.currentTimeMillis()     :" + System.currentTimeMillis());

    System.out.println(new Date(now.toEpochMilli()));

    System.out.println(Instant.ofEpochMilli(System.currentTimeMillis()).atOffset(ZoneOffset.ofHours(8)));


  }
}
