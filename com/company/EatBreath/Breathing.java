package com.company.EatBreath;

public interface Breathing {
    public abstract void breathe();

    public abstract void holdBreath();

    public default void sneeze() {
        System.out.println(getClass().getSimpleName() + " is sneezing");
    }
}
