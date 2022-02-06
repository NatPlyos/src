package com.company.Building;

public abstract class Room implements Rentable {
    protected int roomNumber;
    protected int floorNumber;
    protected int entranceNumber;
    protected int square;
    protected boolean rentedOut;
    protected int rentalRate; // ежемесячная ставка аренды
    protected int rentalPayment; // фактический платеж по аренде
    protected boolean isPaidInCurrentMonth;

    public Room(int roomNumber, int floorNumber, int entranceNumber, int square) {
        this.roomNumber = roomNumber;
        this.floorNumber = floorNumber;
        this.entranceNumber = entranceNumber;
        this.square=square;
    }

    public void rent(int rentalRate) {
        this.rentalRate = rentalRate;
        this.rentedOut = true;
    }

    public void receiveRentPayment(int rentalPayment) {
        this.rentalPayment=rentalPayment;
        if (rentalPayment >= this.rentalRate) {
            this.isPaidInCurrentMonth = true;
        }
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public int getEntranceNumber() {
        return entranceNumber;
    }

    public void setEntranceNumber(int entranceNumber) {
        this.entranceNumber = entranceNumber;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", floorNumber=" + floorNumber +
                ", entranceNumber=" + entranceNumber +
                ", square=" + square +
                ", rentedOut=" + rentedOut +
                ", monthlyRentalPrice=" + rentalRate +
                '}';
    }
}
