package com.company.Building;

public class Office extends Room {
    private String companyName;
    private String companyOwner;
    private int numberOfEmployees;

    public Office(int roomNumber, int floorNumber, int entranceNumber, int square, String companyName, String companyOwner, int numberOfEmployees) {
        super(roomNumber, floorNumber, entranceNumber, square);
        this.companyName = companyName;
        this.companyOwner = companyOwner;
        this.numberOfEmployees = numberOfEmployees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyOwner() {
        return companyOwner;
    }

    public void setCompanyOwner(String companyOwner) {
        this.companyOwner = companyOwner;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public String toString() {
        return "Office{" +
                "companyName='" + companyName + '\'' +
                ", companyOwner='" + companyOwner + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                ", roomNumber=" + roomNumber +
                ", floorNumber=" + floorNumber +
                ", entranceNumber=" + entranceNumber +
                ", square=" + square +
                ", rentedOut=" + rentedOut +
                ", monthlyRentalPrice=" + rentalRate +
                '}';
    }
}
