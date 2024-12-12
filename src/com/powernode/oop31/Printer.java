package com.powernode.oop31;

/**
 * Printer也是实现类，实现usb接口
 */
public class Printer implements Usb{
    @Override
    public void read() {
        System.out.println("Printer is reading...");
    }

    @Override
    public void write() {
        System.out.println("Printer is writing...");

    }
}
