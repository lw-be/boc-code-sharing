package com.lulu.system;

import java.util.Map;
import java.util.Map.Entry;

public class SystemTest01 {


  public static void main(String[] args) {

    Map<String, String> getenv = System.getenv();
    for (Entry<String, String> entry : getenv.entrySet()) {
      System.out.println(entry.getKey() + "  >>>==========>>>   " + entry.getValue());
    }
  }
}
