package com.powernode.javase;
/**
 * 知道哪个数，要找这个数第一次出现时候的下标
 */
public class ArrayTest07 {
    public static void main(String[] args) {
        int[] arr = {200,1,33,4,5,1100,56,6,120,7,6,4,4,4,};
        int elt = 88888;
        int index = findIndexByElt(arr, elt);
        System.out.println(index >=0 ? elt + "result:" + index : "no result");
    }

    public static int findIndexByElt(int[] arr, int elt) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == elt) {
                return i;
            }
        }
        return -1;//返回负数
    }
}
