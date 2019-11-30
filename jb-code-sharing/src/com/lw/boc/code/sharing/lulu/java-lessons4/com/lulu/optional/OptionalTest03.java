package com.lulu.optional;


import java.util.Optional;

public class OptionalTest03 {

  /**
   * 介绍orElse、orElseGet方法-相同点
   */
  public static void main(String[] args) {

    HelloWorld hw = null;
    HelloWorld java = new HelloWorld("java");

    System.out.println("=====orEse=====");
    HelloWorld helloWorld = Optional.ofNullable(hw).orElse(java);

    System.out.println(helloWorld.getLanguage());
    System.out.println("=====orElseGet=====");
    HelloWorld helloWorld1 = Optional.ofNullable(hw).orElseGet(() -> java);

    System.out.println(helloWorld1.getLanguage());


  }
}
