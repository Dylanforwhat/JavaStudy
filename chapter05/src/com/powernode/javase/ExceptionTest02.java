package com.powernode.javase;

public class ExceptionTest02 {
    public static void main(String[] args) {
        //异常的发生要经历2个阶段
        //第一个阶段：创建异常对象
        NullPointerException exception01 = new NullPointerException();

        //第二个阶段：让异常发生(手动抛出异常)
        throw exception01;

        //throw new NullPointerException();直接这么写也可以
    }
}
