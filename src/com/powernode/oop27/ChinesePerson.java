package com.powernode.oop27;

public class ChinesePerson extends Person{
    public ChinesePerson(){
        super();
    }
    public ChinesePerson(String name, int age){
        super(name, age);
    }
    @Override
    public void greet() {
        System.out.println("你好！，我的名字叫" + getName());
    }
}
