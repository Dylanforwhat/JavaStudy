package com.powernode.javase.oop;

import java.util.ArrayList;
import java.util.List;

public class Test002 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Tech");
        arrayList.add("Expert");
        arrayList.set(0,"Java");
        arrayList.replaceAll(s -> s.concat("Group"));
        System.out.println(arrayList);
    }
}
