package com.yixianen.www;

import java.io.*;

public class io1 {
    public static void main(String[] args) {
        /*字节流读取文件内容*/
        try {
            File f = new File("E:/lol.txt");
            //创建基于文件的输入流
            FileInputStream fis = new FileInputStream(f);
            byte [] all = new byte[(int) f.length()];
            fis.read(all);
            for(byte b:all){
                System.out.println(b);
            }
            fis.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        /*字节流读取文件内容*/
        try {
            File file = new File("E:/lol2.txt");
            FileOutputStream fos = new FileOutputStream(file);
            byte data[] = {99,89};
            fos.write(data);
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
