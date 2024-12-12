package com.powernode.oop25;

public class Test {
    public static void main(String[] args) {
        CreditAccount qwl = new CreditAccount("qwl123",123124.3,0.99);
        System.out.println("账号：" + qwl.getNo());
        System.out.println("余额：" + qwl.getBalance());
        System.out.println("信用：" + qwl.getCredit());


    }
}
