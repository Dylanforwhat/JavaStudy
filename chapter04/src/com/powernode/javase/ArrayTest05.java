package com.powernode.javase;

/**
 * 当一个方法的参数是数组的时候，该如何传参。
 *静态两种方式：
 * 第一、
 * 第二、
 *
 * 动态一种，默认值0或者null
 */
public class ArrayTest05 {
    public static void main(String[] args) {
        //第一种静态
        //int[] nums ={1,2,3,4,5};
        //display(nums);

        //第二种静态
        display(new int[]{1,2,3,4,5});

        display(new int[5]);


    }
    public static void display(int[] a) {
        for (int num : a) {
            System.out.println(num);

        }
    }

}
