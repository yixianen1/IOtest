package com.yixianen.www;

import java.io.*;

/*
使用缓存流读写数据
 */
public class Stream {
    public static void main(String[] args) {
        File f = new File("E:/lol2.txt");
        //读取
        //创建文件字符流
        //缓存流必须建立在一个存在的流的基础上
//        try(
//                FileReader fr = new FileReader(f);
//            BufferedReader br = new BufferedReader(fr);
//                )
//        {
//            while (true){
//                //一次只读一行
//                String line = br.readLine();
//                Thread thread = new Thread();
//                thread.sleep(3000);
//                if (null == line){
//                    break;
//                }
//                System.out.println(line);
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        //写入
        try (
                //创建文件字节流
                //缓存流必须建立在一个存在的流的基础上
                FileWriter fw = new FileWriter(f);
                PrintWriter pw = new PrintWriter(fw);
        ) {
            pw.println("伊现恩");
            //此方法强制把缓存的数据写入硬盘，无论缓存是否已满
            pw.flush();
            pw.println("teemo revive after 1 minutes");
            pw.println("teemo try to garen, but killed again");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
