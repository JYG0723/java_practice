package exception;

/**
 * @author Ji YongGuang.
 * @date 11:00 2018/10/22.
 */
public class TryCatchFinallyReturn {

    public static void main(String[] args) {
        // 1
        System.out.println(tryFinallyReturnTest());
    }

    private static int tryFinallyReturnTest() {
        int i = 0;
        try {
            i = 1 / 0;
            return i = 2;
        } catch (Exception e) {
        } finally {
            // 0
            System.out.println(i);
            i++;
            return i;
        }
    }
}
