package com.powernode.javase;

/**
 * 二维数组的动态初始化
 *   →等长：
 *   int[][] arr01 = new int[3][4];
 *   →不等长
 *   int[][] arr02 = new int[3][];
 *
 */
public class ArrayTest13 {
    public static void main(String[] args) {

        //
        int[][] arr = new int[3][4];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int[][] arr2 = new int[3][];
        arr2[0] = new int[]{1,3,3,4};
        arr2[1] = new int[]{2,3,4};
        arr2[2] = new int[]{1,1,1,1,1,1,1,1};

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }



    }
}
