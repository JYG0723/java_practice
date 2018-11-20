package javase.standard.exception;

/**
 * @author Ji YongGuang.
 * @date 8:42 2018/11/10.
 */
public class ExceptionTest9 {

    public static void main(String[] args) {
        try {
            throwExceptionTest();
        } catch (CustomizeException | ArithmeticException e) {
            e.printStackTrace();
        }
    }

    private static void throwExceptionTest() throws ArithmeticException, CustomizeException {
        // 抛出异常
        // throw new ArithmeticException("除数不能为0 Exception");
        throw new CustomizeException();
    }
}
