class AA {
    public void test() {
        System.out.println("A");
    }
}
class BB extends AA{
    public void test() {
        System.out.println("B");
    }
}
public class CC extends AA {
    public void test() {
        System.out.println("C");
    }
    public static void main(String[] args)  {
        AA b1= new AA();
        AA b2 = new CC();
        AA b3 = (BB) b2;
        b1 = (AA) b2;
        b1.test();
        b3.test();
    }
}