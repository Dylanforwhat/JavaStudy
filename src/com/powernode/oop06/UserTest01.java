package com.powernode.oop06;

public class UserTest01 {
    public static void main(String[] args) {
        User u = new User();
        System.out.println("年龄：" + u.age);

        u.age = 99;
        System.out.println("年龄：" + u.age);
        //目前User类没有进行封装。在外部程序中可以对User属性进行随意的访问
        //非常不安全（年龄超出实际）
        //
        u.age = 200;
        System.out.println("年龄：" + u.age);

    }
}
