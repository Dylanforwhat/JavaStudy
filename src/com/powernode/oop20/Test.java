package com.powernode.oop20;

/**
 * 这个程序没有使用多态机制
 * 不符合ocp原则(功能扩展必须修改master的代码)
 *
 */
public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        Master a = new Master();
        a.feed(c);

    }

}
