public class Test006 {
    public static void dosum(Integer x,Integer y){
        System.out.println("Integer sum is " + (x + y));
    }
    public static void dosum(double x,double y){
        System.out.println("double sum is " + (x + y));
    }
    public static void dosum(float x,float y){
        System.out.println("float sum is " + (x + y));
    }
    public static void main(String[] args) {
        dosum(10,20);
        dosum(10.0,20.0);

    }
}
