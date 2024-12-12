package com.powernode.javase.oop;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 测试数组工具类java.util.Arrays
 * 测试用例
 */
public class ArraysTest {
    @Test
    public void testAsList(){
        List list = Arrays.asList(1,2,3,3,4,4,5,5,6,6,7);
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }



    @Test
    public void testCopyof(){
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] newarr = Arrays.copyOf(arr,3);//拷贝长度
        System.out.println(Arrays.toString(newarr));

        int[] newarr2 = Arrays.copyOfRange(arr, 2, 5);//不含5，仅3个
        System.out.println(Arrays.toString(newarr2));

    }


    @Test
    public void testFill(){
        int[] arr = new int[10];
        Arrays.fill(arr, 5);
        System.out.println(Arrays.toString(arr));
    }



    @Test
    public void testBinarySearch() {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.binarySearch(arr, 4));

    }






    /**
     * ParallelSort是cpu并行排序
     * 电脑必须是多核的，适合处理大数据量
     * ParallelSort仅在数据量是4096以上时候启用，4096以下仍用sort
     */
    @Test
    public void testParallelSort(){
        int[] arr = new int[100000000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100000000);

        }
        long begin = System.currentTimeMillis();
        Arrays.parallelSort(arr);
        long end = System.currentTimeMillis();
        System.out.println(end - begin);    //  计算耗时5691ms


    }

    @Test
    public void testSort(){
        int[] arr = {1,2,3,44,5,1,3,32432,54,8};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        String[] str = {"f","e","c","a"};//可以排序， 按照字典顺序
        Arrays.sort(str);
        System.out.println(Arrays.toString(str));
    }

    /**
     * 自定义引用数据类型 比如person不是comparable的子类 无法比较
     * 需要person implements comparable这个接口然后在改写compareTo规则，也就是制定比较规则，具备可比性
     *
     */





    @Test
    public void testEquals() {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        System.out.println(Arrays.equals(arr1, arr2));

        String[] st1 = {"a","bb","ccc"};
        String[] st2 = {"a","bb","ccc"};
        System.out.println(Arrays.equals(st1, st2));
    }











    @Test
    public void testToString() {
        int[] arr = {1,2,3,34,54};
        System.out.println(arr);//[I@3f200884 arr是个对象地址
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 34, 54]
    }

    /**
     * Arrays.deepToString适合将多维数组转换成字符串
     */
    @Test
    public void testDeepToString() {
        int[][] arr = {
                {1,2,3,34,54},
                {1,2,3,4,4,},
                {1,1,1,1,1,1,1,1,1}
        };
        System.out.println(arr);//[[I@4d339552
        System.out.println(Arrays.deepToString(arr));//[[1, 2, 3, 34, 54], [1, 2, 3, 4, 4], [1, 1, 1, 1, 1, 1, 1, 1, 1]]
    }
}
