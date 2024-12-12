package com.powernode.javase.string;

/**
 *
 */
public class IntegerTest04 {
    public static void main(String[] args) {
        //String ->int
        String s1 = "123";
        int i1= Integer.parseInt(s1);

        //int ->String
        int i2 = 123;
        String s2 = Integer.toString(i2);
        String s3= i2 + "";

        //String ->Integer
        String s4 ="456";
        Integer i3 = Integer.valueOf(s4);

        //Integer ->String
        String s5 = String.valueOf(i3);
        String s6 = i3.toString();

        //int ->Integer
        int i4 = 100;
        Integer i5 = Integer.valueOf(i4);//valueOf 装箱
        //Integer ->int
        int i6 = i5.intValue();//intValue 拆箱


    }

}
