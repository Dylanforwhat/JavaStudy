package com.powernode.oop41;

public class User implements Cloneable{
    private String name;
    private Address address;

    public User() {
    }

    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", address=" + address + "]";

    }

    /**
     * 浅克隆只克隆了第一层，后面的指向不变，
     * 深克隆就是无论多少层，全部克隆，
     * 简单说就是user克隆之后，与user有关联的address也要克隆一遍
     */

    @Override
    public Object clone() throws CloneNotSupportedException {
        Address copyAdrr = (Address)this.getAddress().clone();
        User copyUser = (User) super.clone();
        copyUser.setAddress(copyAdrr);

        return copyUser;
    }
}
