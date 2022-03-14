package com.entertainment.client;

import com.entertainment.Television;

class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv1 = new Television("Samsung" , 50);
        System.out.println(tv1);

        // Validate Volume
        tv1.setVolume(5000);
        tv1.setVolume(-22);

        // Validate Brand
        tv1.setBrand("RCA");

        System.out.println(tv1);
    }
}