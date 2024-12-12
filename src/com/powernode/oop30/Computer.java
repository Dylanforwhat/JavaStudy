package com.powernode.oop30;

public class Computer {
    public void connect(HardDriver HD){
        System.out.println("connected");
        HD.read();
        HD.write();

    }
}
