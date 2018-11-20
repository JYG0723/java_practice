package javase.standard.exception;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ji YongGuang.
 * @date 11:06 2018/11/20.
 * @description 泛型擦除
 */
public class GenericEraseTest {

    public static void main(String[] args) {
        /*List<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        List list = strings;
        for (Object target :
                list) {
            System.out.println(target);
        }*/
        genericEraseTest();
    }

    public static void genericEraseTest() {
        Map<String, Integer> map = new HashMap<>();
        map.put("1", 1);
        map.put("2", 1);
        map.put("3", 1);
        map.forEach((Object key, Object value) -> {
            System.out.println(key + ":" + value);
        });
    }
}
