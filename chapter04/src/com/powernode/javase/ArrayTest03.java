package com.powernode.javase;

import java.util.Scanner;

public class ArrayTest03 {
    public static void main(String[] args) {
     //定义一个数组
     double[] a = {0,0,0,0,0,0,0,0,0,0};
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<10;i++){
            System.out.println("请输入第" + (i + 1) + "个学生的成绩：");
            double x = sc.nextDouble();
            a[i] = x;
        }
        //遍历数组
        for (int i = 0; i < a.length; i++) {
            System.out.println("学生"+(i + 1)+"的成绩是："+a[i]);
            
        }

        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];

        }
        System.out.println("总分为：" + sum);
        System.out.println("平均分" + sum / a.length );

    }
}
