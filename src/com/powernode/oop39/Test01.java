package com.powernode.oop39;

/**
 * 返回对象的哈希值，通常作为在哈希表中查找该对象的键值
 * object类的默认实现是根据对象的内存地址生成一个哈希码，将内存地址转换为哈希值
 * 主要为后期集合作准备，快速查找和存储机制
 *实现方法：
 * @IntrinsicCandidate
 *     public native int hashCode();
 *     这是一个本地方法，调用了C++动态链接库
 */
public class Test01 {
    public static void main(String[] args) {
        Test01 test = new Test01();
        test.hashCode();//默认继承Object ，Object中有hashcode（）方法，所以可以随时调
        int i =test.hashCode();
        System.out.println(i);//哈希值：1705736037

    }
}
