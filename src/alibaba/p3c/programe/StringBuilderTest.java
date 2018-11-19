package alibaba.p3c.programe;

/**
 * @author Ji YongGuang.
 * @date 17:09 2018/11/10.
 */
public class StringBuilderTest {

    private static void append() {
        String str = "hikar";
        StringBuilder stringBuilder = new StringBuilder(str);
        for (int i = 0; i < 100; i++) {
            stringBuilder.append(i);
        }

        System.out.println(stringBuilder.toString());
    }

    public static void main(String[] args) {
        append();
    }

}
