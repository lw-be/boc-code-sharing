package com.example.course_cyh;

public class Replacing {
    public static String s = "Happy Birthday to you!　Happy Birthday to you! Happy Birthday to you!　Happy Birthday to you!";
    public static void main(String[] args) {
        // 第一个表达式匹配的是，以字母B开头，后面跟一个或多个字母
        System.out.println(s.replaceFirst("B\\w+", "New Year"));
        // 第二个表达式匹配的是三个单词中的任意一个
        System.out.println(s.replaceAll("Birthday|you", "to"));
    }
}

// 思考：请参考java.util.regex.Pattern的文档，编写一个正则表达式，检查一个句子是否以大写字母开头，以句号结尾。
