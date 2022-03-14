package io.tests;

class PrimitivesTest {

    public static void main(String[] args) {
        int age = 55;
        System.out.println("The value for age is: " + age);

        long humanPopulation = 7_000_000_000L;
        System.out.println("The current human population is: " + humanPopulation);

        double price = 4_323.44;
        System.out.println("The total price is: $" + price);

        boolean isOnSale = false;
        System.out.println("The item is on sale: " + isOnSale);

        // note the use of the single quote --- single quote, single character
        char shirtSize = 'M';
        System.out.println("The size of the shirt is: " + shirtSize);

        String name = "Marcos";
        System.out.println("My name is " + name);

        System.out.println();

        int x = 3;
        int y = x;

        x = 6; // reassign the value of 6 to existing variable x -- no need to redeclare

        System.out.println("the value of y is: " + y);
    }
}