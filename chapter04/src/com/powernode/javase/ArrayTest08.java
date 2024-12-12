package com.powernode.javase;

/**
 *
 */
public class ArrayTest08 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

        public static void reverse(int[] arr){
            for(int i=0;i<arr.length/2;i++){
                //首尾交换
                //首 arr[i]
                //尾 arr[arr.length - 1 - i]
                int temp = arr[i];
                arr[i] = arr[arr.length-1-i];
                arr[arr.length-1-i] = temp;

            }
        }









        /* int[] newarr = reverse(arr);
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i] + " ");
        }
    }
    public static int[] reverse(int[] arr) {
        //创建新数组
        int[] newarr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[arr.length - 1 - i];
        }
        return newarr;*/


}
