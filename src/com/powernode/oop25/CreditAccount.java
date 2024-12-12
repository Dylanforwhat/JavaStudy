package com.powernode.oop25;

/**
 * 信用卡
 */
public class CreditAccount extends Account  {
    double credit; //信用度

    public CreditAccount() {
        super();
    }

    public CreditAccount(String no, double balance, double credit) {
       /* this.no = no;
        this.balance = balance;
        这两行代码在父类中有现成的，无需再写，直接用super调用
        */
        super(no, balance);//子类构造方法调用父类构造方法：1、代码复用；2、给当前对象的父类型特征进行初始化
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }
}
