package com.powernode.javase;

public class ExceptionTest09 {
    public static void main(String[] args) {
    }
    /**
     * return 和 finally  finally还是会执行
     */
    public static void m(){
        try{
            System.out.println("try");
            return;
        }finally{
            System.out.println("finally");
        }

    }
}
