package com.powernode.oop38;

public class User {
    private String name;
    private Address address;
    public User(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    public User(){

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
        return "User{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
//equals的方法要完全重写！
    @Override
    public boolean equals(Object obj) {
        if(obj == null)return false;
        if(obj == this)return true;
        if(obj instanceof User){
            User user = (User) obj;//向下转型要强行cast（User）
            if(this.name.equals(user.getName()) && this.address.equals(user.getAddress())){
                return true;
            }
        }
        return false;
    }
    /**
     * String的equals和toString被官方重写，改成byte数组的每一位比较，每一位都相同的话，true
     */
}
