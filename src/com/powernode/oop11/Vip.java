package com.powernode.oop11;

public class Vip {
    private String name;

    public Vip() {
    }

    public Vip(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void shopping(){
        System.out.println(this.name + "正在购物");
    }

}
