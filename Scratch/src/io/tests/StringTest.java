package io.tests;

class StringTest {
    public static void main(String[] args) {
        String msg = "hello";
        msg.toUpperCase();       // "converts" all characters to uppercase
        System.out.println(msg); // all characters are still lowercase - toUpperCase returns a str, not convert
        System.out.println();

        String city1 = "new york";
        String city2 = "new york";

        // city1 and city2 point to the same object so == works
        System.out.println(city1 == city2);      // WRONG WAY TO COMPARE!!! Even though return true
        System.out.println(city1.equals(city2)); // CORRECT WAY TO COMPARE!!! Always works!

        String city1new = city1.substring(0 , 3); // "new"
        String city2new = city2.substring(0 , 3); // "new"
        /*
         * the two substrings are two DIFFERENT string objects, so city1new and city2new point to different objs
         * when declared explicitly, (city1 and city2) JVM stores only one copy to save space, so == works
         */
        System.out.println(city1new == city2new);       // EVAL to FALSE
        System.out.println(city1new.equals(city2new));  // EVAL to TRUE
    }



}