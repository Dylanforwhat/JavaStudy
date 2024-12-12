package com.powernode.oop14;

public class StudentTest01 {
    public static void main(String[] args) {
        Student s1 = new Student();//com.powernode.oop14.Student@1b28cdfa
        System.out.println(s1);
        Student s2 = new Student();//com.powernode.oop14.Student@eed1f14
        System.out.println(s2);
        System.out.println(s1 == s2);

        int a = 10;
        int b = 10;
        System.out.println(a == b);
    }
}
