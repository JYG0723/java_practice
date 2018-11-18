package alibaba.p3c.exception;

/**
 * @author Ji YongGuang.
 * @date 15:17 2018/11/16.
 */
public class CorrectWayToThrowException {

    private static void throwExceptionCorrectly() throws CustomException {
        throw new CustomException("业务逻辑错误，抛自定义异常", new IllegalArgumentException("客户参数输入有误"));
    }

    public static void main(String[] args) {
        try {
            throwExceptionCorrectly();
        } catch (CustomException e) {
            // e.printStackTrace();
            // 最底层的异常最有价值
            e.getCause().printStackTrace();
        }
    }
}
