/**
 * Client-side "main class", i.e., the "driver" or bootstrap class with main()
 */
class TelevisionClient {

    // ENTRY or starting point for the application
    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount()  + " instances.");

        Television tv1 = new Television();
        tv1.setBrand("Samsung");
        tv1.setVolume(Television.MAX_VOLUME);


        tv1.turnOn();
        tv1.turnOff();

        System.out.println(tv1); // calls toString() automatically

        System.out.println();
        // Second Television
        Television tv2 = new Television("LG" , Television.MIN_VOLUME);

        tv2.turnOff();
        tv2.turnOn();

        System.out.println(tv2);

        System.out.println();
        // Third Television
        Television tv3 = new Television();
        tv3.turnOn();
        tv3.turnOff();

        System.out.println(tv3);

        System.out.println();
        // Fourth Television
        Television tv4 = new Television("MagnaVox" , 54);
        tv4.turnOn();
        tv4.turnOff();

        System.out.println(tv4);

        System.out.println(Television.getInstanceCount()  + " instances.");
    }
}