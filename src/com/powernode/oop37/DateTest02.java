package com.powernode.oop37;

/**
 * Object类中对equals的默认实现方法是怎么样的？
 *  public boolean equals(Object obj) {
 *         return (this == obj);
 *     }
 * 源码分析 a.equals(b);  this与obj  a与b
 * boolean 返回值是true和false
 *
 * ==比较的是变量中保存的值是否相等，可能是int等基本数据类型 也可能是地址，主要看保存的是什么
 *
 *
 * 为什么equals总是要重写？
 * 因为object中默认的是比较对象的内存地址，经常需要比较“对象”的内容，所以重写
 *
 */
public class DateTest02 {
    public static void main(String[] args) {
        Date date1 = new Date(1,1,2008);
        Date date2 = new Date(1,1,2008);
        System.out.println(date1.equals(date2));//new出来的新对象，equals或者==都是比较的地址，地址不一样

        int a = 10;
        int b = 10;
        System.out.println(a == b);

    }
}
