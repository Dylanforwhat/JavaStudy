package com.powernode.oop42;

/**
 * 静态内部类，可以当作静态变量看待
 * 在静态内部类中，无法直接访问外部类的“实例相关”数据，因为没有new对象，静态可以，因为不需要new对象
 */
public class Outer {
    //静态变量
    private static int i = 100;
    //实例变量
    private int j = 200;
    //静态方法
    public static void m1(){
        System.out.println("fangfazhixing");
    }
    //实例方法
    public void m2(){
        System.out.println("waibufangfa");
    }
    //静态内部类，对于静态内部类来说，访问控制权限修饰符这里都可以用
    public static class intter{
        public void m3(){
            System.out.println(i);
            //System.out.println(j);没new对象访问不了
            m1();
            //m2();没对象访问不了
        }

    }


}
