public class ABC {
    public static void main(String[] args) {
        String s = "abcabcabc";
        System.out.println(s.replaceFirst("abc+", "1"));
        System.out.println(s.replaceFirst("(abc)+", "1"));
        System.out.println(s.replaceFirst("(abc)+?", "1"));
        System.out.println(s.replaceFirst("(abc)++", "1"));

        // 量词
        // 贪婪型  勉强型 占有型 如何匹配
        // X+     X+?    X*+   一个或多个X

        // 贪婪型：量词总是贪婪的，贪婪表达式会为所有可能的模式发现尽可能多的匹配
        // 勉强型：用问号来指定，这个两次匹配满足模式所需的最少字符数。因此也称作懒惰的，最少匹配的，非贪婪的
        // 占有型：目前，这种类型的量词只在Java中使用，不具体分析
    }
}
