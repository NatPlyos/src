package com.company.EatBreath;

public class Person implements Eating, Breathing {

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println(getClass().getSimpleName() + " is breathing");
    }

    @Override
    public void holdBreath() {
        System.out.println(getClass().getSimpleName() + " is holding breath");
    }


}
