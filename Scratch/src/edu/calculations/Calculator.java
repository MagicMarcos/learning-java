package edu.calculations;

/**
 * This is an "all-static" class... a class definition with nothingbut static methods.
 * You do not instantiate this class (clients do not say "new") - because there are no instance variables
 * there is no difference between any two instances of edu.calculations.Calculator
 */
class Calculator {

    // you can pass in an INT here (upcasting), and it works because there is no data loss
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /**
     * returns the average of the provided integers.
     */
    public static double average(int first , int... rest){ // accepts an array as arg
        double result;

        double sum = first; // use double, bc int/int results in int, and we need double as result
        for(int value : rest){
            sum += value;
        }

        result = sum / (rest.length + 1); //118.0 / 4 -> 29.5
        return result;
    }
    /**
     * Returns a random INTEGER between 1 and 22 (inclusive).
     *
     * HINT: see a class called Math (in package java.lang), look for a helpful method here.
     * NOTE: these methods in the Math class are all "static". Meaning you call them as follows:
     * Math.methodName()
     */

    public static int randInt(){
        /*
        ORIGINAL HARD CODED VERSION:

        int result = 0; //must return int

        double rand = Math.random(); // 0.000000 to 0.9999999 - random() returns a double
        double scaled = (rand * 22) + 1; // 0.000000 to 21.999999
        result = (int) scaled; // (int) = explicit downcast from double to int - we throw away the decimals

        return result;
         */

        return randInt(1, 22); // DELEGATION - delegates to generalized version below
    }

    /**
     * Returns a random integer between "min" and "max" inclusive
     * For example:  a random integer between 1 and 75
     * NOTE: no constraints have been set (yet), 'min' must be less than 'max' (or results == wrong)
     */
    // we are OVERLOADING the above method -- this one takes 2 params
    public static int randInt(int min , int max){
        int result = 0;

        double rand = Math.random();                // 0.0000 to  0.99999
        double scaled = (rand * (max - min + 1)) ;  // 0.0000 to 70.99999
        double adjusted = scaled + min;             // 5.0000 to 75.99999
        result = (int) adjusted;

        return result;
    }

    /**
     * Return a random integer between 1 and "max" (inclusive).
     * For Example: a random integer between 1 and 10.
     */

    public static int randInt(int max){
        // DELEGATION
        return randInt(1, max); // delegate tot he generalized version
    }
}