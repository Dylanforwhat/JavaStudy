package com.powernode.javase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest06 {
    public static void main(String[] args) {
        try {
            m1();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        }
    }
    public static void m1() throws FileNotFoundException {
        m2();
    }
    public static void m2() throws FileNotFoundException {
        m3();
    }
    public static void m3() throws FileNotFoundException {
        FileInputStream iiinnn = new FileInputStream("e:/b.txt");//构造方法有可能出现异常，是Exception，在编写阶段需要预处理，不然会报错
    }
}
