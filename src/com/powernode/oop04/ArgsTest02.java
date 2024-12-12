package com.powernode.oop04;

/**
 * 面试题：分析以下程序的输出结果
 */
public class ArgsTest02 {
    public static void main(String[] args) {
        User u= new User();// 这里u只是一个引用，User的一个引用，对象在堆中，u是一个指向堆中对象的地址
        u.age = 10;
        add(u);
        System.out.println("main>" + u.age);
    }
    public static void add(User u){//u是一个引用保存地址
        u.age++;
        System.out.println("add>" + u.age);
    }

}

