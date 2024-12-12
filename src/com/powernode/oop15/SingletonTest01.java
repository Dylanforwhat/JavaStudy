package com.powernode.oop15;

public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.get();
        Singleton s2 = Singleton.get();
        System.out.println(s1 == s2);
    }
}
