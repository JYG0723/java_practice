package java.standard.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author Ji YongGuang.
 * @date 20:44 2018/11/7.
 */
public class ExceptionTest6 {


    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("");
        } catch (NullPointerException e) {
            System.out.println("File object is null");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
