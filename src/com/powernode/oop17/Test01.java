package com.powernode.oop17;

public class Test01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("xiaozhang");
        p.eat();
        p.run();

        Teacher t = new Teacher();
        t.setName("zhanglaoshi");
        t.eat();
        t.run();
        t.teach();

        Student s = new Student();
        s.setName("qwl");
        s.eat();

    }
}
