package com.powernode.javase.string;

/**
 * 自动装箱auto boxing 和自动拆箱 auto unboxing
 *  属于编译阶段功能
 *
 *  装箱：Integer i = new Integer(100);
 *  拆箱：int num = i.intValue();
 *
 */
public class IntegerTest05 {
    public static void main(String[] args) {
        //自动装箱
        Integer x = 1000;//程序在编译的时候实际上的代码是：Integer x = new Integer(1000);
        //自动拆箱
        int num = x;//底层调用 int num = x.intValue();


    }
}
