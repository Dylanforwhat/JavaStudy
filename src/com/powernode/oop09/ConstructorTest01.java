package com.powernode.oop09;

public class ConstructorTest01 {
    public static void main(String[] args) {
        //new Student();
        //调用Student类的构造方法来完成Student类型对象的创建；
        //以下代码本质上是：通过new运算符调用无参数的构造方法来完成对象的实例化
        //s1是一个引用，保存了内存地址指向了堆内存当中的Student类型的对象
        //无参数构造法没有给属性手动赋值，但是系统会赋默认值
        Student s1 = new Student();
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        System.out.println(s1.getGender());
        System.out.println(s1.getAddress());
    }

}
