package alibaba.p3c.programe.TransitionTest;

/**
 * @author Ji YongGuang.
 * @date 20:37 2018/11/15.
 */
public class Child extends Base {

    @Override
    public void print() {
        System.out.println("child");
    }

    public String returnChild() {
        return "child!!!";
    }
}
