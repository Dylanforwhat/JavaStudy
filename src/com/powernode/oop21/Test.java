package com.powernode.oop21;

/**
 * 主人喂养宠物的案例，使用多态机制，满足OCP原则
 * 能抽象尽量抽象，面向抽象编程，降低耦合度，提高扩展力
 * Pet就是抽象
 *
 */
public class Test {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();
        Master m = new Master();

        m.feed(c);
        m.feed(d);



    }
}
