package com.powernode.javase.trytest;
import com.powernode.javase.exception.IllegalAgeException;
import com.powernode.javase.exception.IllegalNameException;
import java.util.Scanner;

/**
 * 异常处理的第二种方式
 * 语法格式：
 * try{
 *这里写尝试执行的程序，可能会出现异常
 * 如果这这里出现了异常，try块后面的代码不执行
 * }catch(异常类型1 变量名){
 *
 * }catch(异常类型2 变量名){
 *
 * }catch(异常类型3 变量名){
 *
 * }...
 * catch语句块可以看作分支，在trycatch语句中，最多只有一个catch分支执行。
 * catch可以写多个，但必须自上而下，从小到大。先抓子类异常处理，再抓父类异常处理。
 *
 */
public class ExceptionTest04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎使用本系统，请输入用户名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();

        UserService userService = new UserService();
        try {
            userService.register(name, age);//可能出现异常的代码
        } catch (IllegalNameException e) {
            System.out.println("对不起，用户名不合法！");
        } catch (IllegalAgeException e) {
            System.out.println("对不起，年龄不合法！");
            /*try {
                userService.register(name, age);//可能出现异常的代码
            } catch (IllegalNameException | IllegalAgeException e) {
                System.out.println("对不起，参数不合法！");
        }
        Java 7 的新特性 可以合并catch，输出相同的结果！
        */
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
            throw new IllegalNameException();//下面不要写代码，永远执行不到
        }
        if(age < 18){
            throw new IllegalAgeException();
        }
    }
}
