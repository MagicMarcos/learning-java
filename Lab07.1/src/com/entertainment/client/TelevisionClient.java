package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

/**
 * Client-side "main class", i.e., the "driver" or bootstrap class with main()
 */
class TelevisionClient {

    // ENTRY or starting point for the application
    public static void main(String[] args) {
        System.out.println("Total instance count: " + Television.getInstanceCount());

        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(Television.MAX_VOLUME);
        tv1.setDisplayType(DisplayType.PLASMA);


        tv1.turnOn();
        tv1.turnOff();

        System.out.println(tv1); // calls toString() automatically

        System.out.println();
        // Second com.entertainment.Television
        Television tv2 = new Television("LG" , Television.MIN_VOLUME);

        tv2.turnOff();
        tv2.turnOn();

        System.out.println(tv2);

        System.out.println();
        // Third com.entertainment.Television
        Television tv3 = new Television();
        tv3.turnOn();
        tv3.turnOff();

        System.out.println(tv3);

        System.out.println();
        // Fourth com.entertainment.Television
        Television tv4 = new Television("MagnaVox" , 54 , DisplayType.OLED); // throw brand error
        tv4.setBrand("Toshiba"); // set proper brand
        tv4.turnOn();
        tv4.turnOff();

        System.out.println(tv4);


        System.out.println("Total instance count: " + Television.getInstanceCount());
    }
}