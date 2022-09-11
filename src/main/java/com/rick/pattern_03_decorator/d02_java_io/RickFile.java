package com.rick.pattern_03_decorator.d02_java_io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.zip.ZipInputStream;

/**
 * @Author: Rick
 * @Date: 2022/9/8 11:16
 */
public class RickFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/runzhou/Desktop/tmpFolder/2022/tmp_file.mk");
        // FileInputStream fileInputStream = new FileInputStream("/Users/runzhou/Desktop/tmpFolder/2022/tmp_file.mk.zip");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        ZipInputStream zipInputStream = new ZipInputStream(bufferedInputStream);
        // bufferedInputStream.();


    }
}
