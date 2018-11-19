package learn.exception;

/**
 * @author Ji YongGuang.
 * @date 18:10 2018/11/6.
 */
public class ExceptionTest4 {

    /**
     * 定义方法抛出异常
     *
     * @param x
     * @param y
     * @return
     * @throws MyException
     */
    static int quotient(int x, int y) throws MyException {
        if (y < 0) {
            throw new MyException("除数不能是负数");
        }
        return x / y;
    }

    public static void main(String args[]) {
        int a = 3;
        int b = 0;
        try {
            int result = quotient(a, b);
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (Exception e) {
            System.out.println("程序发生了其他的异常");
        }
    }

}

/**
 * 创建自定义异常类
 */
class MyException extends Exception {
    String message;

    public MyException(String ErrorMessagr) {
        message = ErrorMessagr;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
