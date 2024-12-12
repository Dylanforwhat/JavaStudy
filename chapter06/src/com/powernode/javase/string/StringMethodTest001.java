package com.powernode.javase.string;

import org.junit.jupiter.api.Test;

/**
 * 测试用例
 * 事实上是导入了JUnit的类库
 * 用JUnit写单元测试用例@Test，好处：
 * 1、不用写main方法，直接测；
 * 2、引入了assertion《断言》语法，比较actual和excepted 实际值和期望值
 * 3、运行窗口也跟不一样了，有绿色对勾的窗口
 */
public class StringMethodTest001 {
    @Test
    public void testCharAt() {
        char c = "动力节点".charAt(3);
        System.out.println(c);
    }

    @Test
    public void testlength() {
        System.out.println("动力节点".length());
    }

    @Test
    public void testIsEmpty() {
        String s = "";
        System.out.println(s.isEmpty());
        s = "hello";
        System.out.println(s.isEmpty());
        s = " ";
        System.out.println(s.isEmpty());
    }

    @Test
    public void testEquals() {
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true
    }

    @Test
    public void testContains() {
        System.out.println("helleword".contains("ewo"));
    }

    @Test
    public void testCompareto() {//返回的是两个字符的asc码差值
        System.out.println("a".compareTo("b"));// 返回值-1，如果一样，就放回0
        System.out.println("A".compareToIgnoreCase("a"));//返回值0
    }

    @Test
    public void testIndexOf() {
        System.out.println("asdsadfsjavasdfsdfsadfasdfadfjavadsad".indexOf("java"));//8
        System.out.println("asdsadfsjavasdfsdfsadfasdfadfjavadsad".indexOf("java", 10));//29
        //从10这个位置开始，这个子字符串第一次出现的“下标”（索引）
    }

    @Test
    public void testToCharArray() {
        char[] chars = "动力节点".toCharArray();
        for (char c : chars) {
            System.out.println(c);
        }
    }
    /**
     * +号与concat的区别
     * +号既可以进行求和计算，也可以进行字符串的拼接，底层拼接的时候会创建StringBuilder对象，+号拼接null的时候不会出现空指针异常。
     * concat只能进行字符串拼接，不创建StringBuilder，拼接完成后生成一个新的String对象，concat拼接null会“空指针异常”
     * +号使用居多，如果大量字符串拼接操作，建议使用StringBuilder
     *
     */
    @Test
    public void testConcat(){
        String s1 = "java";
        String s2 = null;
        String s3= s1+s2;
        System.out.println(s3);// javanull
        String s4 = s1.concat(s2);
        System.out.println(s4);//空指针异常

    }
    @Test
    public void testSubString(){
        System.out.println("www.baidu.con".substring(4, 8));//baid  开始下标 和结束下标。这里注意“前闭后开” 这里不包含endIndex下标的元素，所以没有“u”
    }

    /**
     * trim(),去掉前后空白，只能去ASC码和半角空白  \u3000是全角空白去不了  要用trip()去掉
     *
     * String类已经重写了toString（）方法
     *
     *
     */
    @Test
    public void testJoin(){
        //将对个字符串以某个符号间隔的方式进行拼接，生成一个新的字符串。
        String str = String.join("/","a","bc","def","ghil");
        System.out.println(str);

    }

    @Test
    public void testValueOf(){
        //将非字符串转换成字符串
        String s1 = String.valueOf(100);
        System.out.println(s1);
        System.out.println(s1 instanceof String);//true
    }

    @Test
    public void testReplace(){
        String str1 = "oraclejavac++mysqlphppythonjavamysql".replace("java","golang");
        System.out.println(str1);
        String str2 = "a1b2n3v4j5k67s5".replaceAll("\\d","");
        //这里要写成\\d 不久就是d符号
        System.out.println(str2);
    }
    @Test
    public void testSplit(){
        String[] ymd = "1988-12-26".split("-");
        for(String s : ymd){
            System.out.println(s);
        }
    }
}

