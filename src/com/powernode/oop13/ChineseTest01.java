package com.powernode.oop13;

public class ChineseTest01 {
    public static void main(String[] args) {
        Chinese a =new Chinese("420606198812266011","qiuweili");
        Chinese b =new Chinese("420232423423266011","xiaohong");
        Chinese c =new Chinese("420606198122323121","xiaozhang");
        a.display();
        b.display();
        c.display();

        System.out.println("guoji" + Chinese .country);
        System.out.println(a.country);
        System.out.println(b.country);
        System.out.println(c.country);

        a = null;
        b = null;
        c = null;

        System.out.println(a.country);
        System.out.println(b.country);
        System.out.println(c.country);
        //静态变量可以用this.访问，不会出现空指针异常，但是不建议，因为静态跟引用不搭嘎
        //静态变量用 类名. 进行访问


    }
}
