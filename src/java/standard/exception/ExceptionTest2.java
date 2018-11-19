package java.standard.exception;

/**
 * @author Ji YongGuang.
 * @date 16:42 2018/11/6.
 */
public class ExceptionTest2 {

    public static void main(String[] args) {
        int i = 3;
        int a = 0;
        try {
            // TODO 检验出现异常后被catch走后 后续代码不能继续运行
//            serverExceptionMethod();
            throw new Exception("try 异常");
        } finally {
            throw new RuntimeException("finally 运行时异常");
        }
    }

    private static void serverExceptionMethod() throws Exception {
        throw new Exception();
    }
}
