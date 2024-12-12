
public class Test036 {
    public static void main(String[] args) {
        int x=1;
        int y=0;
        if(x++ > ++y) { //checks if(1>1)
            System.out.print("Hello ");
        } else {
            System.out.print("Welcome ");
        }
        System.out.println("Log " + x + ":" + y);
    }


}
