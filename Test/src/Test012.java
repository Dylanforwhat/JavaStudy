public class Test012 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello World!");
        System.out.println(sb);

        String s1 = "Hello World!";
        String s2 = new String("Hello World!");
        System.out.println(s1);
        System.out.println(s2);
    }
}
