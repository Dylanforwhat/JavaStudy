package com.powernode.javase.string;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/**
 * 关于String类的构造方法
 * 1、char数组转换成字符串
 */
public class StringTest03 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        char[] chars = new char[]{'动','力','a','b'};
        String s1 = new String(chars);
        System.out.println(s1);//动力ab

        String s2 = new String(chars,0,3);//offset起始位置，长度
        System.out.println(s2);//动力a

        byte[] bytes = {97,98,99,100};
        String s3 = new String(bytes);
        System.out.println(s3);//abcd,将byte数组转为String，其实是解码过程

        //先将字符串转换成byte[]数组（这是一个编码的过程）
        //这里先按照GBK的字符进行编码。
        byte[] a = "动力节点".getBytes("GBK");
        //将以上byte数组转换成字符串(解码)
        String s5 = new String(a,"UTF-8");
        System.out.println(s5);//产生乱码。  编码和解码的字符编码方式不一样会产生乱码。换言之，出现乱码就去找是否哪里编码解码的规则不同。

        // 在不知道字符编码方式的时候，动态获得平台的编码方式(默认方式)
        byte[] bs = "动力节点".getBytes(Charset.defaultCharset());
        //使用平台默认字符集进行解码
        String s6 = new String(bs,Charset.defaultCharset());
        System.out.println(s6);

    }

}
