package com.lulu.optional;


import java.util.Optional;

public class OptionalTest05 {

  /**
   * 介绍filter方法
   */
  public static void main(String[] args) {

    HelloWorld hw = new HelloWorld("PHP");

    Optional<HelloWorld> helloWorld = Optional.ofNullable(hw)
        .filter(x -> "JAVA".equals(x.getLanguage()));

    System.out.println(helloWorld.isPresent());
    System.out.println(helloWorld.get().getLanguage());

  }

}
