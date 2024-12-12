package com.powernode.oop27;

public class PersonTest01 {
    public static void main(String[] args) {
        Person a = new EnglishPerson("Jack", 18);
        Person b = new ChinesePerson("xiaozhang", 20);
        a.display();
        a.greet();
        b.display();
        b.greet();
    }

}
