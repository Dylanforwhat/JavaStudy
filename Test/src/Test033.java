public class Test033 {
    float myFloat; // 声明一个 float 类型的成员变量

    public void display() {
        System.out.println("myFloat 的默认值: " + myFloat);
    }

    public static void main(String[] args) {
        Test033 example = new Test033();
        example.display();  // 输出: myFloat 的默认值: 0.0
    }
}