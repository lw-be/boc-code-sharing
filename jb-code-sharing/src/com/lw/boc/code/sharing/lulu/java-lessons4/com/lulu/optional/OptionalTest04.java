package com.lulu.optional;


import java.util.Optional;

public class OptionalTest04 {

  /**
   * 介绍orElse、orElseGet方法-区别
   */
  public static void main(String[] args) {

    HelloWorld hw = new HelloWorld("PHP");

    System.out.println("=====orEse=====");
    HelloWorld helloWorld = Optional.ofNullable(hw).orElse(new HelloWorld("java"));

    System.out.println(helloWorld.getLanguage());
    System.out.println("=====orElseGet=====");
    HelloWorld helloWorld1 = Optional.ofNullable(hw).orElseGet(() -> new HelloWorld("java"));

    System.out.println(helloWorld1.getLanguage());

  }

}
