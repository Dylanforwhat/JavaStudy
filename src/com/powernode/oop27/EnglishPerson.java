package com.powernode.oop27;

/**
 * 一个非抽象类继承抽象类之后，必须将抽象类中的所有抽象方法全部重写
 */
public class EnglishPerson extends Person {
    public EnglishPerson() {

    }
    public EnglishPerson(String name, int age) {
        super(name, age);//继承父类的构造方法，包括封装方法
    }

    @Override
    public void greet() {
        System.out.println("hello,my name is " + getName() );
    }
}
