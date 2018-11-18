package exception;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Ji YongGuang.
 * @date 8:56 2018/11/7.
 */
public class ExceptionTest5 {

    public static void main(String[] args) {
        try {
            printFileJava7();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printFileJava7() throws IOException {
        try (FileInputStream input = new FileInputStream("file.txt")) {
            int data = input.read();
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }
        }

        try (FileInputStream fis = new FileInputStream("")) {
            throw new IllegalArgumentException();
        } finally {
        }

    }

    private static void printFileJava8() throws IOException {

        try (FileInputStream input = new FileInputStream("file.txt");
             BufferedInputStream bufferedInput = new BufferedInputStream(input)
        ) {

            int data = bufferedInput.read();
            while (data != -1) {
                System.out.print((char) data);
                data = bufferedInput.read();
            }
        }
    }

    public static void multiCatch() {
        try {
            if (System.currentTimeMillis() % 2 == 0) {
                throw new IOException();
            } else {
                throw new ClassNotFoundException();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void multiCatch_() {
        try {
            if (System.currentTimeMillis() % 2 == 0) {
                throw new IOException();
            } else {
                throw new ClassNotFoundException();
            }
        } catch (IOException | ClassNotFoundException | RuntimeException e) {
            e.printStackTrace();
        }
    }
}
