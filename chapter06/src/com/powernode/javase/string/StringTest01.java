package com.powernode.javase.string;

/**
 * 在java程序当中，凡是带有双引号的字符串，在编译阶段就已经完全确定了，这些字符串字面量将来会在字符串常量池中。
 * 在JVM启动的时候，会进行一系列的初始化，其中就包括字符串常量池的初始化，在初始化字符串常量池的时候，会将所有的字符串字面量全部提前创建好，放在常量池中，执行的时候直接从池中调用
 *
 * java8之后，字符串常量池在堆内存中
 *
 * 字符常量池是一种缓存技术。
 *
 *
 * 字符串一旦创建不可变，因为String底层是byte数组，然后被private和final修饰。final的意思是一旦赋值不可变。private的意思是私有的，外部不可见。
 */
public class StringTest01 {
    public static void main(String[] args) {
        String s1 = "abc";// 从堆中字符串常量池中把abc拿过来，不是代码执行到13行才创建abc字符串
        String s2 = new String("hello");
        System.out.println(s2);

        String s3 = "hello";
        String s4 = "hello";
        System.out.println(s3 == s4);//true 这里证明hello之前就创建好， 所以他们指向一致

        String s5 = "hello";
        String s6 = new String("hello");
        System.out.println(s5 == s6);//false 因为new的新对象地址变了

    }
}
