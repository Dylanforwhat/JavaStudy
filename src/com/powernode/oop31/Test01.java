package com.powernode.oop31;

public class Test01 {
    public static void main(String[] args) {
        //多态
        //接口+多态 →提高系统扩张力

        Usb usb01 = new HardDriver();
        Usb usb02 = new Printer();


        HardDriver HD = new HardDriver();
        Printer P = new Printer();
        Computer C = new Computer();

        C.conncet(usb01);//new也行
        C.conncet(P);  //直接传也行
    }
}
