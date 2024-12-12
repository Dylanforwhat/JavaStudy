import org.junit.jupiter.api.Test;

public class IntegerTest {
    @Test
    public void testUnBoxing() {
        Integer i = new Integer(100);//boxing 装箱
        int num = i.intValue();//unboxing 拆箱
        System.out.println(num + 1);

    }

    @Test
    public void testToStirng() {//包装类都重写了toString()和equals()方法


    }


    @Test
    public void testToJinzhi() {
        int num = 20;
        System.out.println(num + "转16进制：" + Integer.toHexString(num));
    }


    @Test
    public void testparseint() {
        int num1 = Integer.parseInt("123");//"abc"会报NumberFormatException
        double num2 = Double.parseDouble("3.14");
        System.out.println(num1 + 1);
        System.out.println(num2 + 1);
    }


    @Test
    public void testcompare() {
        int comp = Integer.compare(10, 20);
        System.out.println(comp);// -1 -1表示前小后大 0表示相等 1前大后小
    }

    @Test
    public void testmaxmin() {
        System.out.println(Integer.max(10, 20));
        System.out.println(Integer.min(10, 20));
    }

}
