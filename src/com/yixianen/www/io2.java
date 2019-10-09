package com.yixianen.www;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class io2 {
    public static void main(String[] args) {

        try {
            File f = new File("E:/lll2.txt");
            //创建基于文件的Reader
            FileReader fr = new FileReader(f);
            //创建字符数组，其长度就是文件的长度
            char[] all = new char[(int) f.length()];
            //以字符流的形式读取文件所有内容
            fr.read(all);
            for (char b : all) {
                System.out.println(b);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
