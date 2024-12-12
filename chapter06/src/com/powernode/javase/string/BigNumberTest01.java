package com.powernode.javase.string;

import java.math.BigInteger;

/**
 * 1、超过long了怎么办？java.math.BigInteger
 * 2、BigInteger的父类Number
 * 3、BigInteger是引用数据类型
 */
public class BigNumberTest01 {
    public static void main(String[] args) {
       //报错 long num = 99999999999999999999L;
        BigInteger num1 = new BigInteger("9999999999999999999");
        BigInteger num2 = new BigInteger("1");

        //大数字的加法
        BigInteger res1 = num1.add(num2);
        System.out.println(res1);
        //大数字的减法
        BigInteger res2 = num1.subtract(num2);
        System.out.println(res2);


    }

}
