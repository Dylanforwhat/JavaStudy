package com.powernode.oop07;

public class VipTest01 {
    public static void main(String[] args) {
        Vip vip = new Vip();
        vip.setAge(36);
        vip.setGender("man");
        vip.setAddress("xxstreetxxdong");
        vip.setName("xiaohong");
        vip.setMailaddress("xxx2123@gmail.com");

        System.out.println("年龄" + vip.getAge());
        System.out.println("姓名" + vip.getName());
    }
}
