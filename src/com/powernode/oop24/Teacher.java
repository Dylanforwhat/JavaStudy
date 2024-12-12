package com.powernode.oop24;

/**
 * 特有属性：发工资
 */
public class Teacher extends Person{
    double salary;

    public Teacher() {
    }

    public Teacher(String name,int age,String email,String address,double salary) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.address = address;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void display() {
       /* System.out.println(this.getName());
        System.out.println(this.getAge());
        System.out.println(this.getEmail());
        System.out.println(this.getAddress());
        System.out.println(this.getSalary());
*/
        System.out.println(super.name);
        System.out.println(super.age);
        System.out.println(super.email);
        System.out.println(super.address);
        System.out.println(this.salary);

    }

    @Override
    public void doSome() {
        super.doSome();
        System.out.println("renlei wandanl");
    }
}
