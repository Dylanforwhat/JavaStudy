package com.powernode.oop14;

public class SingletonTest01 {
    public static void main(String[] args) {
      //  Singleton s1 = new Singleton();
        // Singleton s2 = new Singleton();
        Singleton s1 = Singleton.get();
        Singleton s2 = Singleton.get();

        System.out.println(s1 == s2);

    }
}
