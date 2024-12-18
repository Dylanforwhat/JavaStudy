package com.powernode.oop18;

/**
 *什么时候考虑使用方法重载？
 * 在同一个类中，相同的方法名，不同的参数列表。
 * 代码美观，方便编程。
 * 方法重载属于编译阶段的功能（方法重载是给编译器看的）
 *
 *
 * 什么时候考虑使用方法重写？
 *
 * 方法覆盖的小细节。
 *     1.当子类将父类方法覆盖之后，将来子类对象调用方法的时候，一定会执行重写之后的方法。
 *     2.在java语言中，有一个注解可以检查是否是重写 @Override
 *     3.@ override 注解只在编译阶段有用，和运行期无关。
 *     4.访问权限不能变低，可以变高。可以把private 变成public
 *     5.抛出异常不能变多，可以变少。throws Exception
 *     6.私有方法和构造方法不能继承，不存在方法覆盖。
 *     7.方法覆盖针对的是实例方法，和静态方法无关。（多态）
 *     8.方法覆盖针对的是实例方法，和实例变量没有关系。
 */
public class OverrideTest01 {
    public static void main(String[] args) {
        Bird b = new Bird();
        b.eat();
        b.move();

    }
}
