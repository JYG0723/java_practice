package javase.standard.exception;

/**
 * @author Ji YongGuang.
 * @date 11:01 2018/11/10.
 */
public class CustomizeException extends Exception {

    public CustomizeException() {
        super();
    }

    public CustomizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public CustomizeException(Throwable cause) {
        super(cause);
    }

    protected CustomizeException(String message, Throwable cause, boolean enableSuppression,
                                 boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
