package alibaba.p3c.programe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Ji YongGuang.
 * @date 21:58 2018/11/10.
 */
public class SetUniqueness<T> {

    private List<T> revortList(List<T> list) {
        Set<T> set = new HashSet<>(list);
        List<T> arrayList = new ArrayList<>(set.size());
        for (T item : set
        ) {
            arrayList.add(item);
        }
        return arrayList;
    }

    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(10);
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 10; i++) {
                integerList.add(i);
            }
        }

        SetUniqueness setUniqueness = new SetUniqueness();
        // 检测元素数
        System.out.println(integerList.size());
        List list = setUniqueness.revortList(integerList);

        // 检测结果
        for (Object objectItem :
                list) {
            System.out.println(objectItem.toString());
        }
    }
}

