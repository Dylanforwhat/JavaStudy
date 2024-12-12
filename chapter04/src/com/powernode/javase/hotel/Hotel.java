package com.powernode.javase.hotel;

/**
 * @author qwl
 * @version 1.0
 * @since 1.0
 */
public class Hotel {
    private Room[][] rooms = new Room[6][10];
    public Hotel() {
        for(int i = 0; i < rooms.length; i++) {
            for(int j = 0; j < rooms[i].length; j++) {
                if(i == 0 ||i == 1){
                    rooms[i][j] = new Room((i+1)*100+j+1,"单人间",false);
                }else if(i == 2 ||i == 3){
                    rooms[i][j] = new Room((i+1)*100+j+1,"标准间",false);
                }else if(i == 4 || i == 5){
                    rooms[i][j] = new Room((i+1)*100+j+1,"豪华间",false);
                }
            }
        }
    }
    public void order(int roomNo){
        rooms[roomNo/100-1][roomNo%100-1].setState(true);//%是求余数符号，就是除完剩多少，比如10%3 余数为1
    }
    public void exit(int roomNo){
        rooms[roomNo/100-1][roomNo%100-1].setState(false);
    }
    public void display(){
        for(int i = 0; i < rooms.length; i++) {
            for(int j = 0; j < rooms[i].length; j++) {
                System.out.print(rooms[i][j]);
            }
            System.out.println();
        }
    }
}
