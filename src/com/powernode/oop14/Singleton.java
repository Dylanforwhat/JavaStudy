package com.powernode.oop14;

/**
 * 单例模式怎么实现？
 *    第一步：构造方法私有化。
 *    第二步：对外提供一个公开的静态的方法。
 *    第三步：定义一个静态变量，在类加载的时候，初始化静态变量。只一次
 */
public class Singleton {
    private static Singleton s = new Singleton();// 静态变量，初始化静态变量

    private Singleton() {//方法私有化
    }
    public static Singleton get(){ //一个公开的静态方法
        return s;
    }
}
