package com.powernode.oop05;

public class StudentTest01 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "xiaozhang";
        System.out.println("学生姓名：" + s1.name);
        s1.study();
        Student s2 = new Student();
        s2.name = "xiaohong";
        System.out.println("学生姓名：" + s2.name);
        s2.study();
    }
}
