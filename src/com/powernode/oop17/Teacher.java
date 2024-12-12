package com.powernode.oop17;

public class Teacher extends Person{
    double salary;

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void teach(){
        System.out.println(this.name + "is teaching");
    }
}
