package alibaba.p3c.programe.TransitionTest;

/**
 * @author Ji YongGuang.
 * @date 20:38 2018/11/15.
 */
public class TransitionTest {

    public static void main(String[] args) {
        // Base base = new Base();
        // Child child = (Child) new Base();

        m1("");
        m1("aaa");
        m1("aaa", "bbb");
    }

    public static void m1(String s, String... ss) {// 可变长参数可以看成是数组
        String[] ars = {};
        System.out.println(ss.length);

        for (int i = 0; i < ss.length; i++) {
            System.out.println(ss[i]);
        }
    }
}
