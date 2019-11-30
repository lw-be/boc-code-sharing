package com.lulu.optional;

import java.util.Optional;

public class OptionalTest01 {

  /**
   * 介绍 of  ofNullable方法
   * @param args
   */
  public static void main(String[] args) {
    String ss = null;
    Optional.of(ss);
    Optional.ofNullable(ss);

  }
}
