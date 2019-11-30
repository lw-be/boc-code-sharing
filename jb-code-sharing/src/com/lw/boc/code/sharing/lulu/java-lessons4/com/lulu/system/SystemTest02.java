package com.lulu.system;

import java.util.Map.Entry;
import java.util.Properties;

public class SystemTest02 {


  public static void main(String[] args) {

    Properties properties = System.getProperties();
    for (Entry<Object, Object> entry : properties.entrySet()) {
      System.out.println(entry.getKey() + "  >>>==========>>>   " + entry.getValue());
    }
  }
}
