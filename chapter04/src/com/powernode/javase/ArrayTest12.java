package com.powernode.javase;

/**
 * 二维数组静态初始化
 *
 */
public class ArrayTest12 {
    public static void main(String[] args) {
        //静态初始化的第一种方式
        int[][] arr = new int[][]{};

        int[][] arr1 = new int[][]{
                {1, 2, 3,4,5},
                {4, 5, 6},
                {7, 8, 9,10,11}
        };
        System.out.println(arr1.length);//这个二维数组中有几个一维数组：3

        System.out.println(arr1[0].length);//这个二维数组中第一个元素“数组”的长度：5

        System.out.println(arr1[0][1]);//这个二维数组中第一个元素“数组”的第二个元素：2

        System.out.println(arr1[arr1.length-1][arr1[arr1.length-1].length-1]);//最后一个“元素”数组的最后一个元素：11

        arr1[arr1.length-1][arr1[arr1.length-1].length-1] = 2222;

        //二维数组静态初始化第二种方法
        int [][] arr2 = {
                {1,2,3,4,5},
                {4,5,6,7,8},
                {8,2,3,4,5},

        };



    }
}
