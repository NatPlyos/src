package com.company.Building;

public class Test {

    public static void main(String[] args) {

        Building house=new Building("Owner",2020,13);

        Room room0=new Apartment(1,1,1,80,4,2);
        Room room1=new Apartment(2,1,1,70,3,1);
        Room room2=new Apartment(3,1,1,50,2,3);
        Room room3=new Office(4,1,1,100,"ООО Рога и копыта","Вася Пупкин",10);
        Room room4=new Office(5,1,1,90,"ЧУП Виток","Петя Птушкин", 5);

        Room [] rooms=new Room[6];
        rooms[0]=room0;
        rooms[1]=room1;
        rooms[2]=room2;
        rooms[3]=room3;
        rooms[4]=room4;
        rooms[5]=new Apartment(6,1,1,35,1,1);

        house.setRooms(rooms);
        System.out.println(house.toString());
        System.out.println(rooms.toString()); //?????? [Lcom.company.Building.Room;@6acbcfc0

        room0.rent(300);
        System.out.println(room0.toString());
        room4.rent(200);
        room0.receiveRentPayment(300);
        System.out.println(room0.isPaidInCurrentMonth);
        room4.receiveRentPayment(100); //false

        int totalRent= house.calculateRent();
        System.out.println("Total rent =" + totalRent);
        int totalWaterConsumptionPerMonth=house.countWaterConsumptionPerDay()*30;
        System.out.println("Total water consumption per month, l = "+totalWaterConsumptionPerMonth);
        int totalOffices=house.countOffices();
        System.out.println("Number of offices =" + totalOffices);
        int totalRentDebt=house.calculateRentDebt();
        System.out.println("Rent debt = "+totalRentDebt);
        double avrRentalRate=house.calculateAverageRentalRate();
        System.out.printf("Average rental rate per m2 = %.2f", avrRentalRate);






    }
}
