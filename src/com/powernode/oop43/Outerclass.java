package com.powernode.oop43;

/**
 * 实例内部类中可以直接访问外部类中的实例成员和静态成员
 */
public class Outerclass {
    //实例变量
    private int i =1000;

    //实例方法
    public void m1(){
        System.out.println("外部类的实例方法m1执行了");
    }

    //静态变量
    private static int j = 200;


    //静态方法
    public static void m2(){
        System.out.println("外部的静态方法没m2执行了");
    }

    //实例内部类
    public class InnerClass{
        public void x(){
            System.out.println(i);
            System.out.println(j);
            m1();
            m2();

            //

        }

    }

}
