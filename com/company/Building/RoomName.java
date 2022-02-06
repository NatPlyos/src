package com.company.Building;

public class RoomName {

    private String roomName;


    public RoomName(String name) { this.roomName = name; }

    public String getName() {
        return roomName;
    }

    public void setName(String name) {
        this.roomName = name;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "name='" + roomName + '\'' +
                '}';
    }
}
