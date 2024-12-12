package com.powernode.oop37;

public class DateTest01 {
    public static void main(String[] args) {
        DateTest01 dt = new DateTest01();
        String string = dt.toString();//先new 再toString  对象→字符串
        System.out.println(string);//com.powernode.oop37.DateTest01@65ab7765

        Date date = new Date();
        date.toString();
        System.out.println(date);

        Date date1 = null;
        System.out.println(date1);
        System.out.println(date1.toString());

    }



}
