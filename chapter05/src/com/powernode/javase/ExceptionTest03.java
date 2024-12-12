package com.powernode.javase;
import com.powernode.javase.exception.IllegalAgeException;
import com.powernode.javase.exception.IllegalNameException;
import java.util.Scanner;

public class    ExceptionTest03 {
    //public static void main(String[] args) throws IllegalNameException, IllegalAgeException {
    public static void main(String[] args) throws Exception{//这里可以写父类型异常Exception
        Scanner sc = new Scanner(System.in);
        System.out.println("欢迎使用本系统，请输入用户名：");
        String name = sc.next();
        System.out.println("请输入年龄：");
        int age = sc.nextInt();

        UserService userService = new UserService();
        userService.register(name, age);
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
