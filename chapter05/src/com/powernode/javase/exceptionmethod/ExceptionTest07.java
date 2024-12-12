package com.powernode.javase.exceptionmethod;

import com.powernode.javase.exception.IllegalAgeException;
import com.powernode.javase.exception.IllegalNameException;

import java.util.Scanner;

public class ExceptionTest07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎使用本系统，请输入用户名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();

        UserService userService = new UserService();
        try {
            userService.register(name,age);
        } catch (IllegalNameException e) {
            //这个方法可以获取当时创建异常对象时给异常构造方法传递的String message参数的值
            //真正的开发中catch不要空白
            //这个方法可以帮忙调试：打印异常堆栈信息  printStackTrace
            //异常信息从上往下看，上面是最主要的信息
            e.printStackTrace();
            String message = e.getMessage();
            System.out.println(message);

        } catch (IllegalAgeException e) {
            String message = e.getMessage();
            System.out.println(message);
        }


    }
}
class UserService{
    public void register(String name, int age) throws IllegalNameException, IllegalAgeException {
        System.out.println("正在注册");
        UserDao userDao = new UserDao();
        userDao.save(name, age);
        System.out.println("注册成功");
    }
}

class UserDao{
    /**
     * 用户要注册，肯定要用户名和年龄这个相关信息时需要保存的。
     * @param name
     * @param age
     */
    public void save(String name, int age)throws IllegalAgeException,IllegalNameException{
        if(name.length() < 6 || name.length() > 12){
            throw new IllegalNameException("无效名字异常。");//下面不要写代码，永远执行不到
        }
        if(age < 18) {
            throw new IllegalAgeException("无效年龄异常。");
        }
        System.out.println("用户信息保存成功！");
        }
    }