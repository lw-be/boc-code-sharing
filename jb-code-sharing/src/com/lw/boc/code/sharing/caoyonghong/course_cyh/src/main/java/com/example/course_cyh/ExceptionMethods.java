package com.example.course_cyh;

import com.example.course_cyh.exception.LoginException;

public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new LoginException(-2, "My Exception");
        } catch (Exception e) {
            System.out.println("Caught Exception");
            System.out.println("getMessage():" + e.getMessage());
            System.out.println("getLocalizedMessage():" + e.getLocalizedMessage());
            System.out.println("toString():" + e);
            System.out.println("printStackTrace():");
            e.printStackTrace(System.out);
        }
    }
}
