package com.powernode.oop04;

/**
 * 判断该程序的输出结果
 *
 */
public class ArgsTest01 {
    public static void main(String[] args) {
        int i = 10;// istore_1 存在一号槽位上
        add(i);//调用add方法的时候，将i传进去，实际上是讲i复制了一份给了add方法
        //这里i传给add方法的是10个值，不是地址，所以main方法里面的i值一直是10

        System.out.println("mian>" + i);

    }
    public static void add(int i){//方法的形参是局部变量
        i++;
        System.out.println(i);

    }
}
