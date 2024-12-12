package com.powernode.oop08;

public class Car {
    private String brand;
    private int price;
    private String color;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price < 200000 || price >500000) {
            System.out.println("对不起价格不合法");
            return;
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
