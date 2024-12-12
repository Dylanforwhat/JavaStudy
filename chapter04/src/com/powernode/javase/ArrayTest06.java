package com.powernode.javase;

/**
 * 找最值方法
 */
public class ArrayTest06 {
    public static void main(String[] args) {
        int[] arr ={1,3,4,5,8,6,66,43,5656,1,2,3};
        int max = searchMax(arr);
        System.out.println("最大值：" + max);

    }
    public static int searchMax(int[] arr){

        int max = arr[0];//假设第一个时最大值
        for(int num : arr){//遍历数组每一个元素
            if(num > max){//与前最大值进行比较，如果大于前最大值
                max = num;//重新给max赋值
            }
        }
        return max;//输出max
    }

}
