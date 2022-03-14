package io.tests;

class WrappersTest {

    public static void main(String[] args) {
        String ageInput = "55";
        int age = Integer.parseInt(ageInput); // produces int 55 from string "55"
        Integer ageInteger = Integer.valueOf(ageInput); // produces Integer(55) from "55"

        String shoeSizeInput = "10.5";
        double shoeSize = Double.parseDouble(shoeSizeInput); // double 10.0 to string "10.5"
        Double shoeSizeDouble = Double.valueOf(shoeSizeInput); // Double(10.5) from "10.5"

        String populationInput = "7000000000";
        long population = Long.parseLong(populationInput); // long 7b from string
        Long populationLong = Long.valueOf(populationInput); // Long(7b) from string

        String marriedInput = "true";
        boolean isMarried = Boolean.parseBoolean(marriedInput); // produces true from "true"
        Boolean marriedBoolean = Boolean.valueOf(marriedInput); // produces Boolean(true) from "true"
    }
}