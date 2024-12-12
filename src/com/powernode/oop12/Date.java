package com.powernode.oop12;
/**
 * 定义一个日期类，包含年月日
 * 两个构造方法，一个是无参构造法，实例化日期对象的时候，默认创建日期是1970-01-01
 * 另一个构造方法，通过传递年月日三个参数确定日期
 *
 * this(实参)
 *    1、通过这个语法可以在构造方法中调用本类中的其他的构造方法
 *    2、作用是代码复用
 *    3、只能出现一次，且在构造方法的第一行
 */

public class Date {
    private int year;
    private int month;
    private int day;

    public Date() {
       /* this.year = 1970;
        this.month = 1;
        this.day = 1;
        */
        this(1970,1,1);
    }
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    public void display() {
        System.out.println(this.year + "-" + this.month + "-" + this.day);
    }
}
