package com.powernode.javase.string;

public class StringBuilderTest01 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder(300);
        StringBuilder sb3 = new StringBuilder("abcdefg");
        StringBuilder sb4 = new StringBuilder(sb3);
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);
        System.out.println(sb4);
    }
}
