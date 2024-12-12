import java.util.function.Predicate;

/**
 * Lambda 抽象函数
 * Predicate 一种抽象函数接口，断言函数，用于对象是否符合条件，符合放回true，不符合返回false
 * Predicate<Integer> p = (n) -> n % 2 == 0;
 * 这里n是一个整数型参数
 * 这里n%2==0 意思是这个整数除以2余数是否为0，就是是不是偶数
 */
public class Test005 {
    public static void main(String[] args) {
        Predicate<Integer> p = (n) -> n % 2 == 0;

    }
}
