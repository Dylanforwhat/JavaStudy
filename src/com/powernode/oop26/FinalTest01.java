package com.powernode.oop26;

/**
 * final 表示最终的，不可变
 * final 修饰的类无法被继承
 * final 修饰的方法无法覆盖
 * final 一旦被赋值 不能重新赋值
 * final 修饰实例变量，必须在构造方法执行玩之前，手动赋值，不能采用默认值，报错
 * final 修饰的实例变量一般和static联合使用，称为常量
 * final 修饰的引用，一旦指向某个对象后，不能再指向其他对象，但指向的对象内部的数据时可以修改的
 * final
 */
public class FinalTest01 {
    public static void main(String[] args) {
        int i = 100;
        i = 1000;

        final int k = 100;
        //k = 1000;Cannot assign a value to final variable 'k'

    }
    class A{
        public final void X(){
            System.out.println("X is final");
        }
    }

   /* class B extends A{
        public void X(){
            System.out.println("B is not final");
        }
    }*/
    /*class MyString extends String{

    }*/
}
