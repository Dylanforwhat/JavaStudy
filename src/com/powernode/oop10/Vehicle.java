package com.powernode.oop10;

public class Vehicle {
    private String brand;
    private int speed;
    private int length;
    private int width;
    private int height;

    public Vehicle() {
    }

    public Vehicle(String brand, int speed, int length, int width, int height) {
        this.brand = brand;
        this.speed = speed;
        this.length = length;
        this.width = width;
        this.height = height;
    }
    public void move(){
        System.out.println(this.brand + "正在以" + this.getSpeed() + "的时速行驶！");

    }
    public void speedUp(){
        System.out.println("加速10迈");
        this.setSpeed(this.getSpeed() + 10);
        this.move();

    }
    public void speedDown(){
        System.out.println("减速10迈");
        this.setSpeed(this.getSpeed() - 10);
        this.move();

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}
