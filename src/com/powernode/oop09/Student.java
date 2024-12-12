package com.powernode.oop09;

/**
 * 1.Constructor构造方法
 * 作用1：对象的创建（通过调用构造方法可以完成对象的创建）
 * 作用2：对象的初始化（给对象的所有属性赋值就是对象的初始化）
 * 2.怎么定义构造方法呢？
 * [修饰符列表] 构造方法名（形参列表）{
 *     构造方法体
 * }
 * 注意：构造方法名必须与类名一致；
 *注意⭐：构造方法不需要返回值类型；写了返回值类型就变成普通方法了
 *
 * 3.构造方法怎么调用？
 * 使用“new”运算符来调用
 * 语法：new 构造方法名（）；
 *注意：构造方法最终执行结束之后，会自动将创建的对象的内存地址返回，构造体方法中不需要return语句
 * 在java中，如果一个类没有显示的去定义构造方法，系统会默认提供一个无参数的构造方法，通常把这个构造方法称为缺省构造器
 *一个类中如果显示的定义了一个构造方法，系统不再提供缺省构造器，所以为了对象创建更加方便，建议把无参数缺省构造器手动写出来
 * 在java中，一个类中可以定义多个构造器，而且这些构造方法自动构成了方法的重载overload
 * 在构造方法中给属性赋值了，为什么还学要单独定义set方法给属性修改呢？
 *  因为在构造方法中赋值是对象第一次创建时的赋值，set是方便后续进行修改，你不可能再用构造方法修改，因为那是初始化
 *  构造方法的执行原理：
 *      构造方法执行包括两个阶段
 *      第一阶段：对象的创建
 *      第二阶段：对象的初始化
 *    对象什么时候创建？
 *       new 的时候，会直接在堆中开辟空间，然后给所有属性赋默认值，完成对象的创建（这个在构造方法执行之前就完成了）
 *    对象初始化在什么时候完成？
 *       构造方法体开始执行，标志着开始进行对象初始化。构造方法体执行完毕，标志对象初始化完毕。
 *
 * 构造代码块
 * {
 *     "构造代码块执行！"
 * }
 * 每一次new，都先执行一次构造代码块
 * 构造代码块是在构造方法执行之前执行的。
 * 构造代码块执行之前对象已经创建好了，并且系统也完成了默认赋值。
 *
 * 构造代码块有什么用？
 *    如果所有的构造方法在最开始的时候有相同的一段代码，不妨将这个公共的代码提取到构造代码块当中，这样代码可以得到复用，更加简便
 *
 *
 */
public class Student {

    public Student(){
        System.out.println("这是一个无参数的缺省构造器");//这个缺省构造器可以省略不写，但是如果出现多个构造器是，缺省构造器会消失
    }
   public Student(String name,int age,String gender,String address){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.address=address;
       System.out.println("这是一个有参构造器"); // 如果缺省构造器不写，这个构造器会替代它，导致后面以缺省构造器模式运行的代码报错

   }

    private String name;
    private int age;
    private String gender;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
