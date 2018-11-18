package alibaba.p3c.exception;

/**
 * @author Ji YongGuang.
 * @date 9:32 2018/11/13.
 * 防止NPE
 */
public class NullPointException {

    private static int packaged(){
        Integer integer = null;
        return integer;
    }

    public static void main(String[] args) {

        try {
            int result = 1 / 0;
        } catch (ArithmeticException e) {
            // log.error("", e);
            // throw new KException("",new Objects(){},e);
        }
    }
}
