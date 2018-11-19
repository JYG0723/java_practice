package java.standard;

/**
 * @author Ji YongGuang.
 * @date 15:03 2018/11/19.
 * @description
 */
public class ForCloneMethodTest3 implements Cloneable{

    public Integer code;
    public String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
