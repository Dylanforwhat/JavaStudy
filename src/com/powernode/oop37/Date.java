package com.powernode.oop37;

/**
 * toString()方法，的目的是？  对象转化为字符串。
 * Object对同toString()方法的默认实现是什么？
 * 查源码，如下
 * public String toString() {
 *         return getClass().getName() + "@" + Integer.toHexString(hashCode());
 *     }
 *
 *
 */

public class Date {
    private int day;
    private int month;
    private int year;
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;

    }
    //date重写“toString”方法，可以自己重写，因为他返回的是一个内存地址，没有可读性
    public Date(){
        this(1,1,1970);

    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {

        return this.year + "-" + this.month + "-" + this.day;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(this == obj){
            return true;
        }
        if(!(obj instanceof Date)){
            int year1 = this.year;
            int month1 = this.month;
            int day1 = this.day;
            Date d = (Date)obj;
            int year2 = d.year;
            int month2 = d.month;
            int day2 = d.day;
            if (year1 == year2 && month1 == month2 && day1 == day2) {
                return true;
            }
        }

        return false;
    }
}
