package com.powernode.javase;

/**
 * 可变长度参数
 * int...nums就是一个可变长度参数
 * 在形参列表中，可变长度参数只能有一个，并且只能在参数列表的末尾
 * 可变长度参数可以当作数组
 */
public class ArrayTest10 {
    public static void main(String[] args) {
       /* m1();
        m1(10);
        m1(10,10);*/
        m1(10,10,10);
        m1(new int[]{10,10,10});

        m2();
        m2("a");
        m2("a","b");
    }
    public static void m1(int...nums){
        //System.out.println("m1执行了");
        for(int i=0; i<nums.length; i++){
            System.out.println(nums[i]);
        }

    }
    public static void m2(String...names){
        System.out.println("m2执行了");

    }
}
