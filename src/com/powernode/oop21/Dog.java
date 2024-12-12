package com.powernode.oop21;

public class Dog extends Pet{
    @Override
    public void eat(){//最左边的蓝色小圆圈就是override重写
        System.out.println("dog eat");
    }
}
