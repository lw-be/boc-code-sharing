package com.lulu.string;

public class StringTest01 {

  public static void main(String[] args) {

    String str1 = "ab";
    String str2 = "a" + "b";

    System.out.println(str1 == str2);

    String str3 = "a" + new String("b");

    System.out.println(str2 == str3);

    String str4 = new String("a") + new String("b");

    System.out.println(str2 == str4);

    String str5 = "a" + new String("b");

    System.out.println(str3 == str5);

  }

}
