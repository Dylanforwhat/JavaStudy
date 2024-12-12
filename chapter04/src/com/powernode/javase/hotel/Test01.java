package com.powernode.javase.hotel;

import java.util.Scanner;

/**
 * 酒店前台使用的程序
 */
public class Test01 {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        System.out.println("欢迎使用本酒店管理系统，请阅读以下说明：");
        System.out.println("【1】查看酒店所有的房间状态");
        System.out.println("【2】预定房间");
        System.out.println("【3】退房");
        System.out.println("【4】退出系统");
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("请输入功能编号：");
            //获取功能编号
            int no = sc.nextInt();
            switch (no){
                case 1 -> hotel.display();
                case 2 -> {
                    System.out.print("请输入预定房间号");
                    int roomNo = sc.nextInt();
                    hotel.order(roomNo);
                    System.out.println("房间预定" + roomNo + "成功");
                }
                case 3 -> { 
                    System.out.print("请输入退房间号");
                    int roomNo = sc.nextInt();
                    hotel.exit(roomNo);
                }
                case 0 -> {
                    System.out.println("再见！");
                    System.exit(0);
                }
            }
        }
    }
}
