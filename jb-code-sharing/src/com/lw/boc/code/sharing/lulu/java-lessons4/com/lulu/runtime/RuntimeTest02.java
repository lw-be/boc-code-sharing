package com.lulu.runtime;


import java.io.IOException;

public class RuntimeTest02 {



  public static void main(String[] args) throws IOException {

    Runtime.getRuntime().exec("notepad.exe");
  }

}
