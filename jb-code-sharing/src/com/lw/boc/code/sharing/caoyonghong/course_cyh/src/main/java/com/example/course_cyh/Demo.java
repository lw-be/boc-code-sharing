package com.example.course_cyh;

import com.example.course_cyh.exception.LoginException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    static String regex = "((1[1-5])|(2[1-3])|(3[1-7])|(4[1-6])|(5[0-4])|(6[1-5])|71|(8[12])|91)\\d{4}((19\\d{2}(0[13-9]|1[012])" +
            "(0[1-9]|[12]\\d|30))|(19\\d{2}(0[13578]|1[02])31)|(19\\d{2}02(0[1-9]|1\\d|2[0-8]))|(19([13579][26]|[2468][048]|0[48])0229)|(20[0-1]\\d{5}))\\d{3}(\\d|X|x)";
    public static Pattern IDNO_18 = Pattern.compile(regex);

    public static boolean isValidIDCardNo(String idCard) {
        if (idCard == null) {
            return false;
        } else {
            boolean valid = false;
            Matcher m = IDNO_18.matcher(idCard);
            IDNO_18.matches("s", "");
            if (m.find()) {
                valid = true;
            }
            return valid;
        }
    }

    public static List<String> getValidIDCardNo(BufferedReader reader) throws Exception {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();//定义一个字符串缓存，将字符串存放缓存中
        String s = "";
        while ((s =reader.readLine()) != null) {//逐行读取文件内容，不读取换行符和末尾的空格
            if (sb.length() > 0) {
                throw new LoginException(110, "文件内容不是连续的一行");
            }
            if (Pattern.compile("\\W").matcher(s).find()) {
                throw new LoginException(111, "文件内容存在特殊字符");
            }
            sb.append(s + "\n");//将读取的字符串添加换行符后累加存放在缓存中
            System.out.println(s);
        }
        Matcher m = Pattern.compile(Demo.regex).matcher(sb);
        while (m.find()) {
            list.add(m.group());
        }
        return list;
    }
}
