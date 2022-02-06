package com.company.EatBreath;

public class Main {
    public static void main(String[] args) {
        Breathing person = new Person();
        Breathing animal = new Animal();

        person.breathe();
        person.holdBreath();
        person.sneeze();

        animal.breathe();
        animal.holdBreath();
        animal.sneeze();

        Animal animal1=new Animal();
        animal1.sneeze();




    }
}
