package com.powernode.oop45;


public class Test01 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //computer.conn(new Printer());

        computer.conn(new Usb(){//既完成了匿名内部类的定义，同时又实例化了一个匿名内部类的对象，匿名内部类只能用一次，连名字都没有。。。

            @Override
            public void read() {

            }

            @Override
            public void write() {

            }
        });
    }
}

        class Computer{
            public void conn(Usb usb){
                usb.read();
                usb.write();

            }
        }
        interface Usb{
            void read();
            void write();
        }
        //编写一个实现类
        /*class Printer implements Usb{
            @Override
            public void read() {
                System.out.println("dayinjidqu");
            }

            @Override
            public void write() {
                System.out.println("dayinjidayin");
            }
        }*/



