package com.company.Time;

public class Time {
    private int seconds;
    private int minutes;
    private int hours;

    public Time(long totalSeconds) {
        if (totalSeconds <= 0) {
            System.out.println("Input error. Seconds cannot be < 0");
        } else {
            this.hours = (int) (totalSeconds / (60 * 60));
            this.minutes = (int) ((totalSeconds - hours * 60 * 60) / 60);
            this.seconds = (int) (totalSeconds-minutes*60-hours*60*60);
        }
    }

    public Time(int seconds, int minutes, int hours) {
        if (seconds <= 0 || minutes <= 0 || hours <= 0) {
            System.out.println("Input error. Time cannot be < 0");
        } else {
            this.seconds = seconds;
            this.minutes = minutes;
            this.hours = hours;
        }
    }

    public int countSeconds() {
        int countSec = seconds + minutes * 60 + hours * 60 * 60;
        return countSec;
    }

    public int countMinutes() {
        int countMin = seconds / 60 + minutes + hours * 60;
        return countMin;
    }

    @Override
    public String toString() {
        return "Time{" +
                "seconds=" + seconds +
                ", minutes=" + minutes +
                ", hours=" + hours +
                '}';
    }
}

