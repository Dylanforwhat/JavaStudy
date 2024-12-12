package com.powernode.oop31;

/**
 * HD是实现类 实现usb接口
 */
public class HardDriver implements Usb {

    @Override
    public void read() {
        System.out.println("HardDriver is reading...");
    }

    @Override
    public void write() {
        System.out.println("HardDriver is writing...");

    }
}
