package com.powernode.oop07;

public class UserTest {
    public static void main(String[] args) {
        User u = new User();
        System.out.println("niangling:" + u.getAge());
        u.setAge(-100);
        System.out.println("niangling:" + u.getAge());
    }
}
