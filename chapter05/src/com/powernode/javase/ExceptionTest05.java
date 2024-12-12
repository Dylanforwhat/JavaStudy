package com.powernode.javase;

/**
 * 异常我们在哪里使用呢？
 *    以前的写法：
 *       if(xxxx){
 *           System.out.println();
 *           return;
 *       }
 *现在的写法：
 *  public void setAge(int age) throws Exception {
 *         if(age < 0 || age > 100){
 *             throw new Exception("年龄不合法");
 *         }
 *         this.age = age;
 *     }
 */
public class ExceptionTest05 {
    public static void main(String[] args) {
        User user = new User();
        try {
            user.setAge(-100);
        } catch (Exception e) {
            System.out.println("、、、、、、、、");
        }
    }

}
class User{
    private int age;

    public User(){

    }
    public User(int age){
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) throws Exception {
        if(age < 0 || age > 100){
            throw new Exception("年龄不合法");
        }
        this.age = age;
    }
}

