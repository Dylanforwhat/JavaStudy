package com.powernode.javase.oop;

public class Test01 {
    public static void main(String[] args) {
        //创建一个数组，既可以存储cat又可以存储bird

        Bird b = new Bird();
        Cat c = new Cat();
        Animal[] animals = {b, c,new Cat(),new Bird()};

        //遍历数组，猫抓老鼠，鸟飞
        for(Animal a : animals){
            if(a instanceof Bird){
                ((Bird) a).birdFly();
                //Bird bird = (Bird)a
                //bird.birdFly();
            }else if(a instanceof Cat){
                ((Cat) a).catchMouse();
            }
        }

    }
}
