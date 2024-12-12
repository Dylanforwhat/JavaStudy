package com.powernode.oop18;

/**
 * Bird 对继承过来的move（）方法不满意，有权力也可以进行修改重写
 */
public class Bird extends Animal {

    @Override
    public void move() {
        System.out.println("flying");
    }
    @Override
    public Object getObj(int a,String b){
        return null;
    }


}
