package alibaba.p3c.exception;

/**
 * @author Ji YongGuang.
 * @date 10:51 2018/11/16.
 * 异常被finally吃掉
 */
public class ExceptionFinally {

    private static String exceptionEatedByFinally() {
        try {
            throw new RuntimeException("测试运行时异常");
        }finally {
            return "had down!";
        }
    }

    private static String objectModifiedByFinallyRuturn() {
        String target = null;
        try {
            target = new String("hikaricp");
            return target;
        }finally {
            return target.substring(0,6);
        }
    }

    public static void main(String[] args) {
        // exceptionEatedByFinally();
        System.out.println(objectModifiedByFinallyRuturn());
    }
}
