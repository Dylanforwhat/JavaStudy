package com.powernode.oop43;

import com.powernode.oop42.Outer;

public class OuterTest01 {
    public static void main(String[] args) {
        Outerclass.InnerClass innerclass = new Outerclass().new InnerClass();//要new两次
        innerclass.x();


    }
}
