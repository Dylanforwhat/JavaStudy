package com.powernode.oop13;

/**
 * static还可以定义静态代码块
 * 语法：
 * static{
 *
 *
 * }
 * 静态代码块在类加载时执行，只执行一次
 *
 *
 * 静态代码块什么用？
 * 类加载的时候用，比如业务需求，类加载的时候记录日志之类，特殊时间点代码
 *
 */
public class StaticTest01 {
    static{
        System.out.println("静态代码块执行了！");
    }

    public static void main(String[] args) {
        System.out.println("main execute");
    }
}
