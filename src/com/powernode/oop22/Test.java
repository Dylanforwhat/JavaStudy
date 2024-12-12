package com.powernode.oop22;

/**
 * 静态方法本身就和多态没有关系，因为多态需要对象，静态没有对象
 */
public class Test {
    public static void main(String[] args) {
        Animal.test();
        Cat.test();//这个不是多态机制

        //以下是多态机制
        Animal a = new Cat();//父类型引用指向子类型对象
        a.test();//这里没有调cat还是调的animal，没有实现多态



    }


}
