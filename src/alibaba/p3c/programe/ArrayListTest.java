package alibaba.p3c.programe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Ji YongGuang.
 * @date 18:31 2018/11/10.
 */
public class ArrayListTest {

    private static String[] toArrayT() {
        ArrayList<String> strings = new ArrayList<>(10);
        strings.add("1");
        strings.add("1");
        String[] strArray = new String[strings.size()];
        strArray = strings.toArray(strArray);
        return strArray;
    }

    private static String[] toArray() {
        List<String> listString = new ArrayList<>(10);
        listString.add("1");
        listString.add("2");
        String[] strings;
        strings = (String[]) listString.toArray();
        return strings;
    }

    private static void iteratorRemove() {
        ArrayList<String> listString = new ArrayList<>(5);
        listString.add("1");
        listString.add("2");
        for (String item : listString) {
            if ("1".equals(item)) {
                listString.remove(item);
            }
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        // toArrayT();
        // toArray();
        iteratorRemove();
    }
}
