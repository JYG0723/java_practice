package alibaba.p3c.exception;

/**
 * @author Ji YongGuang.
 * @date 15:18 2018/11/16.
 */
public class CustomException extends Exception {

    public CustomException() {
        super();
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomException(String message) {
        super(message);
    }
}
