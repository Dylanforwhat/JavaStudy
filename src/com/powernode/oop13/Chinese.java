package com.powernode.oop13;

public class Chinese {
    String idCard;
    String name;
    // String coungry; //这里是一样的，但是实例变量根据对象创建，浪费了14亿人内存
    static String country = "中国";

    public Chinese(String idCard, String name) {
        this.idCard = idCard;
        this.name = name;
    }


/* int i;//实例变量
    static int j;//静态变量

    public static void main(String[] args) {
        int m;//局部变量（方法体中）

    */

    public void display(){
        System.out.println("身份证号：" + this.idCard + "姓名为：" + this.name + "国籍：" + this.country);

    }
}
