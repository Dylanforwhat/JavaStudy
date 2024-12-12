package com.powernode.javase;

/**
 * 数组的扩容问题（数组一旦确定不可变）
 * 1、创建一个更大的数组将原有的数据元素全部拷贝到新数组
 * 2、可以使用System.arrycopy()方法完成数组的拷贝
 * 3、建议减少扩容次数
 */
public class ArrayTest11 {
    public static void main(String[] args) {
        int[] s ={1,2,34,5,5,6,7,8};

        int[] d =new int[s.length * 2];

        System.arraycopy(s,0,d,0,s.length);

        for(int num : d){
            System.out.println(num);
        }

    }
}
