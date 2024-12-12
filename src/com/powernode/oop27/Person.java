package com.powernode.oop27;

/**
 * 定义一个父类：人
 * 具有公共属性
 */
public abstract class Person {
    String name;
    int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + getName() + ", Age: " + getAge());
    }

    /**
     * 这里的greet因为国家不同，方式不同，无法再person中确定下来
     * 下面的是方法体，是一种实现，不合适
     * 只要方法带着大括号，不管里面写没有写代码，都是一种实现，但是不应该给实现，建议定义为抽象方法
     * 抽象方法如何定义：
     * 修饰符列表中添加abstract，不能有大括号（方法体），最终以；结尾
     *有抽象方法 必须是抽象类
     */
    /*public void greet(){

    }*/
    public abstract void greet();
}
