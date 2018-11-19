package alibaba.p3c.programe;

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

    private static void mapForEachTest() {
        Map<Integer, String> map = new HashMap<>();
        for (Map.Entry<Integer, String> entry :
                map.entrySet()) {
            System.out.println((entry.getKey() + ": " + entry.getValue()));
        }

        // forEach的函数逻辑就是每迭代一次的时候运行一下BiConsumer的accept函数
        map.forEach(new BiConsumer<Integer, String>() {
            @Override
            public void accept(Integer integer, String s) {
                System.out.println((integer + ": " + s));
            }
        });

        map.forEach((key, value) -> {
            if (String.valueOf(key).equals(value)) {
                System.out.println(key);
            }
            //
            System.out.println(value);
        });
    }

    public static void main(String[] args) {
        mapForeachTest();
    }
}
