package com.lulu.optional;

import java.util.Optional;

public class OptionalTest02 {

  /**
   * 介绍get方法
   * @param args
   */
  public static void main(String[] args) {
    String ss = "123";
    Optional<String> opt = Optional.ofNullable(ss);
    System.out.println(opt);
    String s = opt.get();
    System.out.println(s);
  }
}
