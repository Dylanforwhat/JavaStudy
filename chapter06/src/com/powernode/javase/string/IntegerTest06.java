package com.powernode.javase.string;

public class IntegerTest06 {
    public static void main(String[] args) {
        Integer x = 10000;
        Integer y = 10000;
        System.out.println(x == y);//false

        Integer a = 127;
        Integer b = 127;
        System.out.println(a == b);//true a和b都是地址，说明他们指向同一个对象，难以致信
        /**
         * 这里是因为【-128到127】总计256个Integer对象已经事先new好了，放在一个数组里，叫“整数型常量池”
         * 没有超出整数型常量池范围的数字，直接取
         */
    }
}
