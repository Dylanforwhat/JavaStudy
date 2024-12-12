package com.powernode.oop29;

/**
 * 1、一种规范或契约，定义了一组抽象方法和常量，用来描述一些实现这个接口的类应该具有哪些行为和属性，接口和类一样，是一种引用数据类型。
 * 2、接口怎么定义？【修饰符列表】interface 接口名{}
 * 3、抽象类是半抽象的，接口是完全抽象的，接口没有构造方法，也无法实例化（无法new）
 * 4、接口中定义的是 抽象方法 + 常量
 * 接口中的常量的static final可以省略。接口中抽象方法的abstract可以省略。接口中所有的方法和变量都是public的。
 * 5、接口和接口之间是可以多继承的  extends A,B,C{}
 * 6、类和接口的关系叫做实现（类和类之间叫继承），因为接口完全抽象，new不出对象
 * 使用implements关键字进行接口的实现
 * 7、一个非抽象的类实现接口必须将接口中所有的抽象方法全部实现
 * 8、java8之后允许出现默认方法和静态方法
 * 当添加或者删除一个抽象方法的时候，这会破坏接口的所有实现，所有接口的用户都必须修改其代码才能适应，接口演变问题。
 * 9、jdk8之后，接口中可以定义静态方法，只能通过该接口名进行调用，接口也可以当工具用了，（静态适合工具类）
 * math、Arrays完全可以用接口进行定义，官方没有修改math类 是因为接口是后来的
 * 10、jdk9之后允许定义私有的静态方法和私有的实例方法，本接口自己用，如果default方法太大，可以拆分为若干private方法。内部调用。
 *
 *
 */
public interface MyInterface {

    default void method(){

    }


    interface A{
        void a();
    }
    interface B{
        void b();
    }
    interface C extends A,B{
        void c();
    }



    class MyinterfaceImpl implements MyInterface,C {

        @Override
        public void c() {
            System.out.println("ccc");

        }

        @Override
        public void a() {
            System.out.println("aaa");

        }

        @Override
        public void b() {
            System.out.println("bbb");

        }
    }
}
