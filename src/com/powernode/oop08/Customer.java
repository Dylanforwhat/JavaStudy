package com.powernode.oop08;

/**
 * 顾客类
 */
public class Customer {
    private String name;//实例变量由“引用.xxx”进行访问
    private int age;
    private String gender;
    private String address;

    /**
     * 这里的实例方法 不需要加static
     * 因为这个方法需要对象才能触发，shopping的动作必须有customer在先，这是实例方法的特点，由对象触发
     *
     */
    public void shopping(){
        System.out.println(this.name + "正在疯狂购物!!!");
        pay();//this.pay();省略了this.

    }
    public void pay(){
        System.out.println(this.name + "正在付款");

    }
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
