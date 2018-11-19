package alibaba.p3c.programe;

import static java.lang.System.out;
/**
 * @author Ji YongGuang.
 * @date 20:29 2018/11/15.
 */
public class ChangeableAragument {

    public void print(String... args) {
        for (int i = 0; i < args.length; i++) {
            out.println(args[i]);
        }
    }

    public void print(String test,String...args ){
        out.println("----------");
    }

    public static void main(String[] args) {
        ChangeableAragument test = new ChangeableAragument();
        /*test.print("hello");
        test.print("hello", "alexia");*/
    }
}
