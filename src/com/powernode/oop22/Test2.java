package com.powernode.oop22;
/**
 * 方法得覆盖是针对实例方法，和实例变量没有关系
 */
public class Test2 {
    public static void main(String[] args) {
    A a = new B();
    System.out.println(a.name);
    }
}
class A {
    String name = "xiaozhang";
}

class B extends A {
    String name = "lishi";
}