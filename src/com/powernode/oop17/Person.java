package com.powernode.oop17;

/**
 *
 */
public class Person {
    String name;
    int age;
    boolean gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public void eat(){
        System.out.println(this.name + "is eating");
    }
    public void run(){
        System.out.println(this.name + "is running");
    }
}
