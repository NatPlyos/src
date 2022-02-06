package com.company.Building;

public class Apartment extends Room {

    private int numberOfRooms;
    private int numberOfResidents;
    RoomName[] roomNames;

    public Apartment(int roomNumber, int floorNumber, int entranceNumber, int square, int numberOfRooms, int numberOfResidents) {
        super(roomNumber, floorNumber, entranceNumber, square);
        this.numberOfRooms = numberOfRooms;
        this.numberOfResidents = numberOfResidents;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfResidents() {
        return numberOfResidents;
    }

    public void setNumberOfResidents(int numberOfResidents) {
        this.numberOfResidents = numberOfResidents;
    }

    public RoomName[] getRoomNames() {
        return roomNames;
    }

    public void setRoomNames(RoomName[] roomNames) {
        this.roomNames = roomNames;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "numberOfRooms=" + numberOfRooms +
                ", numberOfResidents=" + numberOfResidents +
                ", roomNumber=" + roomNumber +
                ", floorNumber=" + floorNumber +
                ", entranceNumber=" + entranceNumber +
                ", square=" + square +
                ", rentedOut=" + rentedOut +
                ", monthlyRentalPrice=" + rentalRate +
                '}';
    }
}
