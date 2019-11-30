package com.lulu.optional;

public class HelloWorld {

  private String language;

  public HelloWorld() {
  }

  public HelloWorld(String language) {
    System.out.println("=====init " + language + " HelloWorld=====");
    this.language = language;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }
}
