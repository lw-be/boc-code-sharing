package com.lulu.string;

public class StringTest02 {

  public static void main(String[] args) {
    String string3 = "a" + "b";// "ab"
    String string4 = "a" + new String("b"); // "ab"
    String string5 = new String("a") + new String("b");

    System.out.println("string3 == string4.intern() : " + (string3 == string4.intern()));
    System.out.println("string3 == string5.intern() : " + (string3 == string5.intern()));
    System.out.println("string4.intern() == string5.intern() : " + (string4.intern() == string5.intern()));

  }
}
