package com.powernode.oop23;
/**
 * 父类应包含公共属性和公共方法
 */
public abstract class Person {
    String name;
    public Person() {
    }
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract void greet();//这里不知道到底写什么代码，建议不行,用abstract抽象类
}
