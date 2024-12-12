package com.powernode.oop26;

public class ProductTest01 {
    public static void main(String[] args) {
        final Product A = new Product("xiaomi", 222.2);
// final 了一个引用，其实是final了它的地址，final的地址指向不能修改，但是里面的变量内存可以修改，小米可以改。222.2可以改
        A.setProductName("huawei");
        A.setProductPrice(2222.2);

    }
}
