package alibaba.p3c.exception;

/**
 * @author Ji YongGuang.
 * @date 11:05 2018/11/16.
 * 自动拆箱导致异常
 */
public class UnBoxingTriggerException {

    private static int unBoxingTriggerException() {
        // debug 可知，经历过了unboxing。调用了Integer.intVal()
        return new Integer(1);
    }

    public static void main(String[] args) {
        int result = unBoxingTriggerException();
        System.out.println(result);
    }
}
