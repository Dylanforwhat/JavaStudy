package com.powernode.oop07;

/**
 * 为了保证User属性的安全，我们要使用封装机制，封装布置如下：
 * 第一步，属性私有化，使用private
 * 属性私有化的目的是禁止外部对属性的随意访问
 * 所有被private修饰的，都是私有的，只能在本类中访问
 * 第二步为了保证外部的程序仍然可以方位age属性，因此要对外提供可以访问的入口
 * 访问一般包含两种：
 *    读：读取属性
 *    改：修改属性
 * 那么应该对外提供两个方法，一个是读，一个是修改
 * 读方法的格式：
 *    public int getAge(){}(只是为了读，不需要参数)
 * 改方法的格式
 *    public void setAge(int age){}(不需要返回值所以用void)
 */
public class User {
    private int age;
    public int getAge(){//  getter方法是绝对安全的，因为只涉及到读取
         return age;
    }
    public void setAge(int age){
        if (age < 0 || age > 100){//setter是需要编写拦截过滤代码的，来确保安全性
            System.out.println("对不起你的年龄不合法");
            return;
        }
        this.age = age;
    }
}
