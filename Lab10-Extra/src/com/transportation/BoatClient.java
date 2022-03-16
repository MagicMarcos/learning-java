package com.transportation;

class BoatClient {

    public static void main(String[] args) {
        Boat b = new Boat("BBB222");
        // if we change the reference type to Vehicle, then we must handle exceptions here
        // i.e., Vehicle b = new Boat("fsdfkjsdf") -> must handle checked exception
        b.moveTo("Cape Cod");
    }
}