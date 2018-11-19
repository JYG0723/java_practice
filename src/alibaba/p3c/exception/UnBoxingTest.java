package alibaba.p3c.exception;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ji YongGuang.
 * @date 11:19 2018/11/16.
 */
public class UnBoxingTest {

    /** tag */
    private static final String TAG = "tag";
    /** code */
    private Integer code;
    /** username */
    private String username;

    public static void main(String[] args) {
        Map<String, Boolean> map = new HashMap<String, Boolean>();
        Boolean b = (map != null ? map.get("test") : false);
    }
}
