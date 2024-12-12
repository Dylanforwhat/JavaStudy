package com.powernode.javase;

/**
 * 什么是异常？执行的错误或者意外
 * 异常机制在java中有什么用？提高程序的健壮性
 * 在java语言中，异常是以什么形式存在的？
 * 以类和对象的形式存在的。
 * 定义异常本质上是定义一个类
 * 异常如果发生的话，也会new对象
 * 异常的老祖宗是throwable
 *
 *
 * 所以程序员编程问题的异常统一继承RuntimeException
 * 所有程序员编程之外的异常统一继承Exception
 *
 * 所有的编译时异常 在编写阶段都需要预处理 如果不处理的话 编译器会报错
 * 所有的运行时异常 在编写阶段可以选择处理不处理
 *
 * 无论时编译时异常 还是运行时异常 都是在运行时发生的
 * 为什么叫编译时异常 ？因为必须在编译时处理，不然编译器报错，注意不是异常
 */
public class ExceptionTest01 {
    public static void main(String[] args) {
        /*int a = 10;
        int b = 0;
        int c = a / b;
        System.out.println(c);*/
        /**
         * Exception in thread "main" java.lang.ArithmeticException: / by zero
         * 	at com.powernode.javase.ExceptionTest01.main(ExceptionTest01.java:12)
         *
         * 	Arithmetic 算术异常 不能除0  这个异常在lang包中 说明是个类
         */

        String s = null;
        //s.toString();//Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.toString()" because "s" is null
        //at com.powernode.javase.ExceptionTest01.main(ExceptionTest01.java:22)
        /**
         * 这里发生空指针异常，程序执行到这里JVM就会在底层new一个NullPointerException类型的实例
         *
         */

    }
}
