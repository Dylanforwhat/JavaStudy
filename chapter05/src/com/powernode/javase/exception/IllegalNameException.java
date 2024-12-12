package com.powernode.javase.exception;

/**
 * 自定义异常“无效名字异常”
 * 第一步，编写类，继承exception
 * 第二个，提供两个构造方法，一个无参 一个有参+调用super《记住》
 */
public class IllegalNameException extends Exception {
    public IllegalNameException() {
    }

    public IllegalNameException(String message) {
        super(message);
    }

}
