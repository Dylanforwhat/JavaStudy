public class Test008 {
    public static void main(String[] args) {
        StringBuilder sObj = new StringBuilder("Java");
        System.out.println(sObj.indexOf("the"));
        sObj.append("the Great");
        System.out.println(sObj.indexOf("the"));
    }
}
