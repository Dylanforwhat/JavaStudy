package com.powernode.javase.string;

import org.junit.jupiter.api.Test;

/**
 * StringBuilder相关想法
 */
public class StringBuilderMethodTest {
    @Test
    public void testDel(){
        StringBuilder s = new StringBuilder();//StringBuilder的底层只创建一个对象
        s.append(10);
        s.append("abc");
        s.append(false);
        s.append(3.14);
        s.append(new Object());

        s.delete(3,5);//索引3和4删除，这里是左闭右开，包括3，但不包括5，这里注意已经是个大字符串了。
        System.out.println(s.toString());
    }


    @Test
    public void testAppend(){
        StringBuilder s = new StringBuilder();//StringBuilder的底层只创建一个对象
        s.append(10);
        s.append("abc");
        s.append(false);
        s.append(3.14);
        s.append(new Object());
        System.out.println(s.toString());
    }
}
