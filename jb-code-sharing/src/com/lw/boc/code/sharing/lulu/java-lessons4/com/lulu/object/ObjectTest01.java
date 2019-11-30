package com.lulu.object;

import java.lang.reflect.Field;

public class ObjectTest01 {

  /**
   * 重写equels方法要保证hashcode重写，并且得满足equels相等的情况下hashcode必相等
   * @param args
   */

  public static void main(String[] args) {
    String abc = "123";

    System.out.println(abc.hashCode());

    Class<? extends String> aClass = abc.getClass();

    Field[] fields = aClass.getDeclaredFields();

    for (int i=0;i<fields.length;i++){
      try {
        Field field = fields[i];
        field.setAccessible(true);
        String name = field.getName();
        Object value = field.get(abc);

        System.out.println("==========");
        System.out.println("name:" + name);
        System.out.println("value:" + value);
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      }
    }

  }
}
