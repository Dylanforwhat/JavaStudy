package com.powernode.oop44;

/**
 * 局部内部类，等于局部变量 ，只能活到方法和结束
 *
 * 局部内部类能不能访问外部类的实例变量和实例方法，取决于局部内部类所在的外部类方法：
 * 如果这个方法是静态的，只能访问外部静态，
 * 如果这个方法是实例的，都可以访问;
 * 局部内部类不能用访问修饰符修饰，因为就在局部有效，public什么的没有意义。
 * 局部额内部类在访问外部的局部变量时候，这个局部变量默认是final的，无法重新赋值
 */
public class OuterClass {
    //静态变量
    private static int k = 1;
    //实例变量
    private int f = 2;

    public void m1(){
        //局部变量
        int i = 100;
        //局部内部类
        class InnerClass {
            //实例方法
            public void x(){
                System.out.println(k);
                System.out.println(f);
                System.out.println(i);

            }
        }
        //这里new对象
        InnerClass i1 = new InnerClass();
        i1.x();
    }
    public static void m2(){//静态方法→静态上下文→只能访问静态变量
        //局部内部类
        class InnerClass {
            public void x(){
                System.out.println(k);
               //  System.out.println(f); 非静态变量
            }

        }
    }
}
