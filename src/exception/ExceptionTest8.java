package exception;

/**
 * @author Ji YongGuang.
 * @date 21:24 2018/11/7.
 */
public class ExceptionTest8 {


    public static void main(String[] args) {
        restoreProgram();
        returnExceptionMessage();
    }

    private static void restoreProgram() {
        int a = 3;
        int b = 0;
        int c;

        try {
            c = a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            b = 3;
            c = a / b;
        }
        System.out.println(c);
    }

    private static String returnExceptionMessage() {
        int a = 3;
        int b = 0;
        int c;

        try {
            c = a / b;
        } catch (ArithmeticException e) {
            return "被除数不能为0";
        }
        return "not error message";
    }
}
