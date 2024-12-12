class Vehicle01 {
    int x;
    Vehicle01() {
        this(10); // line n1
    }
    Vehicle01(int x) {
        this.x = x;
    }
}
class Car extends Vehicle01 {
    int y;
    Car() {
        super(10); // line n2
    }
    Car(int y) {
        super(y);
        this.y = y;
    }
    public String toString() {
        return super.x + ":" + this.y;
    }
}
public class Test035 {
    public static void main(String[] args) {
        Vehicle01 y = new Car(20);
        System.out.println(y);
    }
}