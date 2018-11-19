package java.standard.exception;

/**
 * @author Ji YongGuang.
 * @date 17:13 2018/11/6.
 */
public class ExceptionTest3 {

    public static void main(String args[]) {
        int i = 0;
        String greetings[] = {" Hello world !", " Hello World !! ",
                " HELLO WORLD !!!"};
        while (i < 4) {
            try {
                // 特别注意循环控制变量i的设计，避免造成无限循环
                System.out.println (greetings[i]);
                i++;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("数组下标越界异常");
            } finally {
//                throw new Exception();
                System.out.println("--------------------------");
            }
        }
    }
}
