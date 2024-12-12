package com.powernode.javase.string;

/**
 * s3指向的对象，没有在字符串常量池中，而是在堆中。
 * 底层实际上在进行“+”的时候，会创建一个StringBuilder对象，对字符串进行拼接。
 * 最后会自动调用StringBuilder的toString()方法，再将StringBuilder转换成String对象。
 *
 * 常量池不是一层不变的，可以根据需要增加常量池内容 采用“Sting s5 = s3.intern();”语句。
 *
 *
 *
 *
 */
public class StringTest02 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = s1 + s2;//+号两边有一个是变量，就会启动StringBuilder
        String s4 = "abcdef";
        System.out.println(s3 == s4);//false
        System.out.println(s3.equals(s4));//true

        String x = "java" + "test";//等同于String x = "javatest" 因为编译器觉得两边都不是变量，直接拼接放常量池
        String y = "javatest";
        System.out.println(x == y);//true
        /**
         * 以上代码留意：“+”左右没有变量，编译器会拼接放常量池，这是java做的一个优化
         */




    }
}
