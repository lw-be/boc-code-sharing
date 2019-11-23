import java.util.regex.Pattern;

public class PatternTest {
    public static void main(String[] args) {
        String test1 = "Hello World!";
        String test2 = "Hello World。";
        String regex = "^[A-Z].*。$";
        System.out.println(Pattern.matches(regex, test1));
        System.out.println(Pattern.matches(regex, test2));
    }

}
// 字符类正则表达式
// . 任意字符
// [abc] 包含a、b和c的任何字符（和a|b|c作用相同）
// [^abc] 除了a、b和c之外的任何字符
// [a-zA-Z] 匹配a到z或A到Z的任何字符
// \s 空白符（空格、tab、换行、换页和回车）
// \S 非空白父符（[^\s]
// \d 数字[0-9]
// \D 非数字
// \w 词字符[a-zA-Z0-9]
// \W 非词字符