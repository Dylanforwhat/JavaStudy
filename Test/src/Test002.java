/**
 * indexOf(String str,int fromIndex);
 * indexOf("a",3);例如从第四个位置开始查找字符串a，没有找到返回-1
 * charAt(); 返回索引处的字符，从0开始
 */
public class Test002 {
    public static void main(String[] args) {
        String str = "Sweet Sweet";
        String str2 = str.trim().charAt(6) + " " + str.indexOf("Sw",1);
        System.out.println(str2);

    }
}