package com.powernode.oop19;

/**
 * 基本数据类型之间的类型转换
 * 第一种：小容量转大容量，自动类型转换
 * 第二种，大容量转小容量，不自动，强制类型转换
 *
 * 除所有基本数据类型转换之外，对于引用数据类型来说，也可以进行类型转换
 * 自动类型转换称为 向上转型
 * 强制类型转换称为 向下转型

 *
 * 关于java语言中的向上和向下转型
 *
 *向上转型（upcasting）：
 *   1、子＞父
 *   2、可以同等看作自动类型转换
 *   3、前提是两种类型之间要有继承关系
 */
public class Test01 {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eat();
        a1.move();
        Cat c1 = new Cat();
        c1.eat();
        c1.move();
        Bird b1 = new Bird();
        b1.eat();
        b1.move();



        Animal a2 = new Cat();//子转父 ，小容量包含在大容量中
        a2.move();
        //a2.catchMouse(); 这个在编译阶段就报错，因为Animal里面没有catchMouse，找不到编译报错。
        //假如非要用a2去抓老鼠，就必须父转子，向下转型：downcasting
        //

        Cat c2 =(Cat)a2;
        c2.catchMouse();

        Bird b2 = new Bird();
        // Cat c3 = (Cat)b2;不管向上还是向下两者之间必须有继承关系
        /**
         * 第一阶段：编译阶段
         * 在编译的时候，编译器只知道a2的类型是Animal类型。
         * 因此在编译的时候就会去Animal类中找move（）方法。
         * 找到之后，绑定上去，此时发生静态绑定。能偶绑定成功，编译通过。
         * 第二阶段：运行阶段。
         * 在运行的时候，堆内存中真实的java对象是Cat类型。所以move（）的行为一定是Cat发生的。
         * 因此运行的时候就会自动调用对象的move（）方法。
         * 这种绑定称为运行期绑定或者动态绑定。
         *
         * 因为编译是一种形态，运行的时候又是另一种形态，叫做”多态“
         *
         * 通常也叫“父类型引用指向子类型对象”
         */
        Animal a3 = new Cat();
        //Bird b3 = (Bird)a3;
        /**
         * 编译可以通过，因为a3是Animal类型，都存在继承关系，语法没有问题
         * 运行时候会出现ClassCastException？因为运行时堆中真实对象是cat，cat无法转成bird，出现异常
         *instanceof运算符可以解决ClassCastException异常。
         * instanceof运算的语法规则：
         *     1.instanceof运算符的结果一定是：true/false
         *     2.语法格式：
         *        （引用 instanceof 类型）
         *     3.例如：
         *
         */

         if(a3 instanceof Bird){
             System.out.println("========");
             Bird y = (Bird)a3;
         }
        /**
         * 需求是：程序运行阶段动态确定对象
         * 如果对象是cat，请抓老鼠
         * 如果对象是bird，就请唱歌
         */
        Animal a = new Bird();
        if(a instanceof Cat){
            Cat cat = (Cat) a;
            cat.catchMouse();

        }else if(a instanceof Bird){
            Bird bird = (Bird)a;
            bird.sing();

        }
    }
}
