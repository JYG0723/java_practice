package learn;

import java.util.logging.Logger;

/**
 * @author Ji YongGuang.
 * @date 9:34 2018/11/19.
 * @description
 */
public class ObjectCloneMethodTest implements Cloneable {

    public static final Logger log = Logger.getLogger("ObjectCloneMethodTest");

    /**
     * 无论是浅拷贝还是深拷贝，都需要实现 clone() 方法，来完成操作。
     *
     * @return 新的实例
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        // 设计思想,即便try块中有了return了，这里还是要return。
        return null;
    }

    public static void main(String[] args) {
        ObjectCloneMethodTest entity = new ObjectCloneMethodTest();
        System.out.println((entity.clone() != entity));
        arrayCloneTest();
    }

    private static void arrayCloneTest() {
        int size = 5;
        // String[] stringArr = new String[size];
        int[] intArr = new int[size];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }
        for (int target :
                intArr.clone()) {
            System.out.println(target);
        }
    }
}
