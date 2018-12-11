package javase.standard.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ji YongGuang.
 * @date 17:57 2018/11/30.
 * @description 正则表达式
 */
public class RegexExpression {

    private static Pattern NUMBER_PATTERN = Pattern.compile("[0-9]+");
    private static Pattern INTEGER_NUMBER = Pattern.compile("\\d{3,5}");

    private static void regexExpressionTest(String pression) {
        System.out.println(pression.matches("[\\w[.-]]+@[\\w[.-]]+\\.[\\w]+"));
    }

    private static void regexApiTest(String args) {
        Matcher matcher = NUMBER_PATTERN.matcher(args);
        System.out.println(matcher.matches());
    }

    private static void extraTest() {
        Pattern p = Pattern.compile("cat");
        Matcher m = p.matcher("one cat two cats in the yard");
        StringBuffer sb = new StringBuffer();
        while (m.find()) {
            m.appendReplacement(sb, "dog");
            // System.out.println(sb.toString());
        }
        m.appendTail(sb);
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        // regexExpressionTest("jiyongguang0723@gmail.com");
        // regexApiTest("965307790");
        extraTest();
    }
}
