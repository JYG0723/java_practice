package alibaba.p3c.programestatute;

import static java.lang.System.out;


/**
 * @author Ji YongGuang.
 * @date 15:09 2018/11/10.
 */
public class ArragumentChangeable {
    /// 测试函数
    /*private static void print(String arg) {
        out.print(arg);
    }*/

    private static void print(String... args) {
        for (String arg : args) {
            out.print("");
        }
        out.println("nothing");
    }

    public static void main(String[] args) {
        print();
    }
}
