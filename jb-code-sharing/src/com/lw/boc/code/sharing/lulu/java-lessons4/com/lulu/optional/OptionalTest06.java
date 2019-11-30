package com.lulu.optional;


import java.util.Optional;

public class OptionalTest06 {


  public static void main(String[] args) {

    HelloWorld hw = null;

    Optional.ofNullable(hw).ifPresent(x->System.out.println(x.getLanguage()));

  }

}
