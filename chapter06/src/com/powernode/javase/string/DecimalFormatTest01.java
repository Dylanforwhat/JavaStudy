package com.powernode.javase.string;

import java.text.DecimalFormat;

/**
 * 数字格式化
 * 一般用于展示
 * 把数字转成特定格式的字符串
 *
 */
public class DecimalFormatTest01 {
    public static void main(String[] args) {
        //创建一个数字格式化对象
        DecimalFormat df = new DecimalFormat("###,###.##");
        String s = df.format(1234534.64);
        System.out.println(s);
    }
}
