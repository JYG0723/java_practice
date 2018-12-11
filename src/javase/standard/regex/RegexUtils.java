package javase.standard.regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ji YongGuang.
 * @date 15:40 2018/12/3.
 * @description 正则表达式工具类
 */
public class RegexUtils {

    private static final Pattern XWL_REGEX_EXTRACT = Pattern.compile("xwl=\\w+\\p{Punct}\\w+\\p{Punct}+\\w+");

    public static List<String> extractString(String args) {
        Matcher matcher = XWL_REGEX_EXTRACT.matcher(args);
        List<String> res = new ArrayList<>();
        while (matcher.find()) {
            res.add(matcher.group());
        }
        return res;
    }

    public static void main(String[] args) {
        String target =
                "importModules\":\"[\\\"m?xwl=admin/task/common\\\"]\",url: \"m?xwl=admin/user/selectDept\", Wb" +
                        ".request({\n" +
                        "                url: 'm?xwl=admin/dept/move',";
        List<String> res = extractString(target);
        for (String url :
                res) {
            System.out.println(url);
        }
    }
}
