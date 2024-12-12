package com.powernode.oop30;

public class Test01 {
    public static void main(String[] args) {
        HardDriver driver = new HardDriver();
        Computer computer = new Computer();
        computer.connect(driver);
    }
}
