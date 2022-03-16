package com.transportation;

public class Boat extends Vehicle{

    public Boat(String vin) {
        super(vin);
    }

    @Override
    // in order to join the Vehicle "family" you MUST moveTo(),
    // but DON'T HAVE to throw an exception
    public void moveTo(String location) {
        System.out.println("Boat moving.");
    }
}