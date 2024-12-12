package com.powernode.oop38;

public class Address {
    private String street;
    private String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null)return false;
        if(obj == this)return true;
        if(obj instanceof Address){
            Address address = (Address) obj;
            if(this.street.equals(address.street) && this.city.equals(address.city)){
                return true;
            }
        }
         return false;
    }
}
