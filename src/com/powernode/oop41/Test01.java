package com.powernode.oop41;

public class Test01 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address a =new Address("长安街","北京");
        User user1 = new User("xiaohong",a);

        //克隆一个对象
        User user2 = (User) user1.clone();

        System.out.println(user1);
        System.out.println(user2);

        user2.getAddress().setCity("天津");
        System.out.println(user1);
        System.out.println(user2);



    }
}
