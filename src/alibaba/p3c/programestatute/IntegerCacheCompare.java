package alibaba.p3c.programestatute;

/**
 * @author Ji YongGuang.
 * @date 16:08 2018/11/10.
 */
public class IntegerCacheCompare {

    /**
     * 相当于从IntegerCache中取对象，超出Integer范围的对象都是new出来的。
     * 不同变量不会指向同一个对象
     */
    private static Integer in = 128;
    private static Integer ni = 128;

    private static boolean compareIntegerCache() {
        return true;
    }

    public static void main(String[] args) {
        int i = 4;
        System.out.println(in == ni);
    }
}
