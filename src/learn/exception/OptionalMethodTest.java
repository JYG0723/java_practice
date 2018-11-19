package learn.exception;

import java.util.Optional;

/**
 * @author Ji YongGuang.
 * @date 14:20 2018/11/16.
 */
public class OptionalMethodTest {

    public static void main(String[] args) {
        // 获取Optional容器的3种方式
        Optional optional = Optional.of("optional");
        Optional nullAble = Optional.ofNullable("hikari");
        Optional emptyOptional = Optional.empty();

        // 返回Optional容器中实际存储的value(T)
        emptyOptional.get();
        // 是否该Optional容器存储的value不为null
        nullAble.isPresent();
        // 消费者accept掉
        nullAble.ifPresent(target -> System.out.println(target));
        // 把不符合条件的值变为 empty()
        nullAble.filter(optionalHadValue -> {
            if (optionalHadValue.equals("hikari")) {
                return true;
            }
            return false;
        });
        // flatMap() 总是与 map() 方法成对的
        // map 函数处理
        nullAble.map(nullAbleHadValue -> {
            return nullAbleHadValue.toString();
        });

        // 如果为null返回其他值，不为空返回该值
        nullAble.orElse("hikariCP");
        emptyOptional.orElse("hi");
        // 如果该this的value为null那么返回other的value
        nullAble.orElseGet(() -> Optional.of("valueIsNull"));
        // value的比较
        nullAble.equals(optional);
    }
}
