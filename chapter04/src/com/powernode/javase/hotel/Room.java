package com.powernode.javase.hotel;

/**
 * @author qwl
 * @version 1.0
 * @since 1.0(开始版本号或开始日期2024-09-22)
 */
public class Room {
    private int roomNo;
    private String type;
    private boolean state;

    public Room() {
    }
    public Room(int roomNo, String type, boolean state) {
        this.roomNo = roomNo;
        this.type = type;
        this.state = state;
    }
    public int getRoomNo() {
        return roomNo;
    }
    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public boolean isState() {
        return state;
    }
    public void setState(boolean state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return "[" + roomNo + "," + type + "," + (state ? "占用" : "空间") + "]";
    }
}
