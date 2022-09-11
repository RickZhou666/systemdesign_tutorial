package com.rick.pattern_03_decorator.d02_java_io;

import java.io.*;

/**
 * @Author: Rick
 * @Date: 2022/9/8 12:04
 */
public class InputTest {
    public static void main(String[] args) {
        int c;

        try {
            InputStream in =
                    new LowerCaseInputStream(
                            new BufferedInputStream(
                                    new FileInputStream("/Users/runzhou/git/systemdesign_tutorial/systemdesign_tutorial/src/main/resources/test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
