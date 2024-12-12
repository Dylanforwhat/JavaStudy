package com.powernode.javase;

/**
 * 数组动态初始化：
 * 当创建数组的时候，不知道数组中具体储存什么元素的时候，动态初始化
 * 语法格式;
 * 数据类型[] 变量名 = new 数据类型[长度];
 * 均采用默认值
 */
public class ArrayTest04 {
    public static void main(String[] args) {

        String[] nums = new String[3];
        for(String nn:nums){
            System.out.println(nn);
        }
        int data[] ={2010,2013,2014,2015,2014};
        for(int e : data){
            if(e != 2014) {
               continue;


            }
        }


    }
}
