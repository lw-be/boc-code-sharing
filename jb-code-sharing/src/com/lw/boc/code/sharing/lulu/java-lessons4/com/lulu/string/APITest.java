package com.lulu.string;

public class APITest {


  public static void main(String[] args) {

//    format(String format, Object... args) 新字符串使用本地语言环境，制定字符串格式和参数生成格式化的新字符串。
//
//    format(Locale locale, String format, Object... args) 使用指定的语言环境，制定字符串格式和参数生成格式化的字符串。

//     https://blog.csdn.net/lonely_fireworks/article/details/7962171/

    String str = "绿湾科技%s-%s";

    System.out.println(String.format(str,"服务端","lulu"));

    System.out.println(System.lineSeparator());

  }
}
