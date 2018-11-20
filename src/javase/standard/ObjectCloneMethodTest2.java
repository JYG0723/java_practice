package javase.standard;

/**
 * @author Ji YongGuang.
 * @date 10:21 2018/11/19.
 * @description
 */
public class ObjectCloneMethodTest2 implements Cloneable{

    public Integer age;
    public String name;
    public ObjectCloneMethodTest objectCloneMethodTest;

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjectCloneMethodTest2 objectCloneMethodTest2 = new ObjectCloneMethodTest2();
        objectCloneMethodTest2.age = 1;
        objectCloneMethodTest2.name = "张三";
        objectCloneMethodTest2.objectCloneMethodTest = new ObjectCloneMethodTest();

        ObjectCloneMethodTest2 target = (ObjectCloneMethodTest2) objectCloneMethodTest2.clone();
        // 根据Cloneable接口的规约一定为false
        System.out.println(target == objectCloneMethodTest2);
        // true 浅拷贝，指向了同一对象
        System.out.println(target.name == objectCloneMethodTest2.name);
        // true 浅拷贝，指向了同一对象
        System.out.println(target.objectCloneMethodTest == objectCloneMethodTest2.objectCloneMethodTest);


    }
}
