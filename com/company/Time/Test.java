package com.company.Time;

public class Test {
    public static void main(String[] args) {
        Time time = new Time(10000);
        System.out.println(time);
        int totalMinutes = time.countMinutes();
        int totalSeconds = time.countSeconds();
        System.out.println("total minutes = " + totalMinutes);
        System.out.println("total seconds = " + totalSeconds);

        Time time1 = new Time(5, 47, 6);
        System.out.println("total minutes = " + time1.countMinutes());
        System.out.println("total seconds = " + time1.countSeconds());


    }
}
