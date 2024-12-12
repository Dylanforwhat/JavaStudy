package com.powernode.javase.exception;

/**
 * 自定义异常“无效年龄异常”
 *
 * 
 */
public class IllegalAgeException extends Exception {
    public IllegalAgeException() {
    }

    public IllegalAgeException(String message) {
        super(message);
    }
}
