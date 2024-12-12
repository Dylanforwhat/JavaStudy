package com.powernode.javase.oop;
/**
 * 测试用例
 */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;//import了Junit

public class MathTest01 {
    /**
     * 单元测试方法
     */
    @BeforeAll
    public static void beforeAll() {
        System.out.println("开始执行单元测试");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("单元测试执行完毕");
    }

    @Test
    void testSum(){
        System.out.println("testSum");
        int actual = Math.sum(10, 20);//实际值 你的代码运算出来的
        int expected = 30;// 期望值 就是你自己写的
        Assertions.assertEquals(expected, actual);//断言，从JUnit引入的判断方法

    }
    @Test
    void testSub(){
        System.out.println("testSub");
        int actual = Math.sub(20,10);
        int expected = 10;
        Assertions.assertEquals(expected, actual);

    }
    @Test
    void testMul(){
        System.out.println("testMul");
        int actual = Math.mul(20,10);
        int expected = 200;
        Assertions.assertEquals(expected, actual);


    }
    @Test
    void testDiv(){
        System.out.println("testDiv");
        int actual = Math.div(20,10);
        int expected = 2;
        Assertions.assertEquals(expected, actual);

    }
}
