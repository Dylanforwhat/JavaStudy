public class Test040 {
    public static void main(String[] args) {
        int ans = 0;
        try {
            int num = 10;
            int div = 0;
            ans = num / div;
        } catch (ArithmeticException ae) {
            ans = 0;
        } catch (Exception e) {
            System.out.println("Invalid calculation");
        }
        System.out.println("Ans = " + ans);

    }

}
