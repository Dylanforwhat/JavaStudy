package com.powernode.oop05;

public class Student {
    String name;
    public void study(){
        System.out.println(this.name + "正在努力学习");
        //this本质是一个引用
        //保存当前对象的内存地址，谁调用当前对象就是谁
        //任何一个实例变量的局部变量表的0号槽位存的都是“this”，this可变，根据new出来的当前对象，this包含的地址会变

    }
}
