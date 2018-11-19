package java.standard.exception;

import java.io.FileNotFoundException;

/**
 * @author Ji YongGuang.
 * @date 21:14 2018/11/7.
 */
public class ExceptionTest7 {

    public static void main(String[] args) {


    }

    private static void attemptMethod(int i) throws FileNotFoundException {
        if (i < 0) {
            /*
                这里虽然抛出，但是函数签名上并没有throws出该异常是因为NullPointerException是RuntimeException的子类
                    程序并不会对UnChecked异常做强制性捕获或抛出要求。
                Java程序默认允许我们对运行时异常不处理，即程序中如果由于出现逻辑错误导致运行系统自动生成
                    或我们自己判断出该运行时异常即可手动声明出。
             */
            throw new NullPointerException();
        }

        if (i > 0) {
            throw new FileNotFoundException();
        }
    }
}
