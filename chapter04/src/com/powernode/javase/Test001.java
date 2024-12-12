package com.powernode.javase;
public class Test001 {
    public static void main(String[] args) {
        String [][] room = new String[6][10];
        String i ="单人间";
        String j = "标准间";
        String s = "空闲";

        room[0] = new String[]{101 + i + s,102 + i + s};
        room[1] = new String[]{201 + i + s,202 + i + s};
        room[2] = new String[]{301 + j + s,302 + j + s};
        room[3] = new String[]{401 + j + s,402 + j + s};

        for (int a = 0; a < room.length; a++) {
            for (int b = 0; b < room[a].length; b++) {
                System.out.print(room[a][b] + " ");
            }
            System.out.println();
        }
    }
}
