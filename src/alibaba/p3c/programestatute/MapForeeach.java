package alibaba.p3c.programestatute;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * @author Ji YongGuang.
 * @date 19:40 2018/11/10.
 */
public class MapForeeach {

    private static void mapForeachTest() {
        HashMap<Integer, String> map = new HashMap<>(10);
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "1");

        for (Map.Entry<Integer, String> entry :
                map.entrySet()) {

        }

        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println(integer + ": " + s);
            }
        });

        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }

    public static void main(String[] args) {
        mapForeachTest();
    }
}
