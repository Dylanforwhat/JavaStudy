package com.powernode.javase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 放在finally语句库中的代码一定会执行
 * 至少更try在一起，catch不是必须的
 */
public class ExceptionTest08 {
    public static void main(String[] args) {
        /*try{
            String a = null;
            a.toString();
        }finally{
            System.out.println("finally");
        }*/
FileInputStream fis = null;
try{
    fis = new FileInputStream("E:\\JAVA学习课堂笔记\\IDEA\\JavaSE\\chapter05\\src\\com\\powernode\\javase\\ExceptionTest08.java");
    byte[] bytes = new byte[1024];
    int readCount = 0;
    while((readCount = fis.read(bytes)) != -1){
        System.out.println(new String(bytes,0,readCount));


    }
}catch(FileNotFoundException e){
    e.printStackTrace();
}catch(IOException e){
    e.printStackTrace();

}finally {
    if (fis != null) {
        try {
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}
    }

}
