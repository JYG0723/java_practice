package java.standard;

import java.util.Objects;

/**
 * @author Ji YongGuang.
 * @date 15:01 2018/11/19.
 * @description
 */
public class ObjectCloneMethodTest3 implements Cloneable {

    public Integer code;
    public String name;
    public ForCloneMethodTest3 forCloneMethodTest3;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // 浅拷贝
        ObjectCloneMethodTest3 returnEntity = (ObjectCloneMethodTest3) super.clone();
        /*
           深拷贝开始
           1. 借助Cloneable接口的特性，使引用类型成员变量ForCloneMethodTest3的类实现Cloneable接口且重写Object的clone函数
           2. 然后再对已super.clone出来的对象的引用对象调用其clone函数。
         */
        returnEntity.forCloneMethodTest3 = (ForCloneMethodTest3) returnEntity.forCloneMethodTest3.clone();
        return returnEntity;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectCloneMethodTest3 objectCloneMethodTest3 = new ObjectCloneMethodTest3();
        objectCloneMethodTest3.code = 1;
        objectCloneMethodTest3.name = "origin_object";
        objectCloneMethodTest3.forCloneMethodTest3 = new ForCloneMethodTest3();

        ObjectCloneMethodTest3 cloneMethodTest3 = (ObjectCloneMethodTest3) objectCloneMethodTest3.clone();

        // true
        System.out.println(Objects.equals(objectCloneMethodTest3.code, cloneMethodTest3.code));
        // true
        System.out.println(Objects.equals(objectCloneMethodTest3.name, cloneMethodTest3.name));
        // true
        System.out.println(!Objects.equals(objectCloneMethodTest3.forCloneMethodTest3,
                cloneMethodTest3.forCloneMethodTest3));
    }
}
