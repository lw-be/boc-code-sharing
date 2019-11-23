package com.example.course_cyh;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test9 {
    public static void main(String[] args) {
        String testStr = "Java now has regular expressions";
        String[] regs = {"^Java", "\\Breg.*", "n.w\\s+h(a|i)s", "s?", "s*", "s+",
                "s{4}", "s{1}", "s{0,3}"};

        for (int i = 0; i < regs.length; i++) {
            Matcher m = Pattern.compile(regs[i]).matcher(testStr);
            System.out.println(regs[i] + ": " + m.find());
        }
    }
}
