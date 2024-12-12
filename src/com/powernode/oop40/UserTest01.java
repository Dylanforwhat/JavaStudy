package com.powernode.oop40;

/**
 * 关于Object类中的clone（）方法：
 *
 * 1、clone 方法作用：对象拷贝，通常在开发中需要保护原对象数据结构，复制一份生成一个新对象，对新对象进行操作。
 *
 * 2、Object类中的默认实现：
 * protected native Object clone() throws CloneNotSupportedException
 *   受保护的方法，专门给子类使用
 *   本地方法。
 *   底层调用c++程序已经可以完成对象的创建了，
 * 3、关键是如何解决clone方法的调用问题？
 *   在子类中重写该clone（）方法
 *   并且为了保证clone（）方法在任何位置都可以调用，建议将其修饰符修改为：public
 *
 * 4、凡是参加克隆的对象都必须实现一个标志接口Cloneable()
 *   Java中两大类接口：第一类标志型接口Clonebale()
 *   另一类普通接口
 */
public class UserTest01 {
    public static void main(String[] args) throws CloneNotSupportedException {
        User user = new User(20);
        System.out.println(user);

        //克隆一个user对象，浅克隆方式，浅拷贝方式
        Object obj = user.clone();//报错，因为Object类中的clone（）方法是protected修饰的，protected只能在本类，子类，同胞中被访问
        //User user1 = (User)user.clone();  转型写法
        System.out.println(obj);

        User user2 = (User) obj;
        user2.setAge(99);
        System.out.println(user2);


    }
}
