package com.powernode.oop38;

public class Test01 {
    public static void main(String[] args) {
        Address address = new Address("daxing","beijing");
        User user = new User("xiaohong",address);

        Address address1 = new Address("daxing","beijing");
        User user1 = new User("xiaohong",address1);

        System.out.println(user.equals(user1));

    }
}
