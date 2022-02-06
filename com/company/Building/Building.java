package com.company.Building;

import java.util.Arrays;

public class Building {

    Room[] rooms;
    protected String owner;
    protected int yearOfConstruction;
    protected int numberOfFloors;
    protected static final int residentWaterConsumption = 200;
    protected static final int emloyeeWaterConsumption = 10;

    public Building(Room[] rooms, String owner, int yearOfConstruction, int numberOfFloors) {
        this.rooms = rooms;
        this.owner = owner;
        this.yearOfConstruction = yearOfConstruction;
        this.numberOfFloors = numberOfFloors;
    }

    public Building() { }

    public Building(String owner, int yearOfConstruction, int numberOfFloors) {
        this.owner = owner;
        this.yearOfConstruction = yearOfConstruction;
        this.numberOfFloors = numberOfFloors;
    }

    public Room[] getRooms() { return rooms; }

    public void setRooms(Room[] rooms) { this.rooms = rooms; }

    public String getOwner() { return owner; }

    public void setOwner(String owner) { this.owner = owner; }

    public int getYearOfConstruction() { return yearOfConstruction; }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }

    public int getNumberOfFloors() { return numberOfFloors; }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public int countApartaments() {
        int count = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] instanceof Apartment) {
                count++;
            }
        }
        return count;
    }

    public int countOffices() {
        int count = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] instanceof Office) {
                count++;
            }
        }
        return count;
    }

    public int countWaterConsumptionPerDay() {
        int countResidents = 0;
        int countEmployees = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] instanceof Office) {
                countEmployees = countEmployees + ((Office) rooms[i]).getNumberOfEmployees();
            } else if (rooms[i] instanceof Apartment) {
                countResidents = countResidents + ((Apartment) rooms[i]).getNumberOfResidents();
            }
        }
        return   (countEmployees)*emloyeeWaterConsumption*20/30
                +  (countResidents)*residentWaterConsumption;
        // 20 - average number of working days in a month for employee
    }

    public int calculateRent() {
        int rent = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].rentedOut) {
                rent = rent + rooms[i].rentalRate;
            }
        }
        return rent;
    }

    public int calculateRentDebt() { // подсчет суммы долга
        int rent=this.calculateRent();
        int paidRent = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].rentedOut) {
                paidRent = paidRent + rooms[i].rentalPayment;
            }
        }
        return rent-paidRent;
    }

    public double calculateAverageRentalRate() {
        int rent=this.calculateRent();
        int square = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i].rentedOut) {
                square=square+rooms[i].square;
            }
        }
        return (double) rent/(double) square;
    }

    @Override
    public String toString() {
        return "Building{" +
                "owner='" + owner + '\'' +
                ", yearOfConstruction=" + yearOfConstruction +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }
}
