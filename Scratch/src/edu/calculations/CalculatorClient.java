package edu.calculations;

import static edu.calculations.Calculator.*; // considered ok to use * in this case
// allows us to call methods without saying Calculator.isEven() -> just isEven()

class CalculatorClient {
    public static void main(String[] args) {
        // no need to call new edu.calculations.Calculator, this is an all-static class (just use dot notation i.e., edu.calculations.Calculator.add)

        // hold the variable here if you plan on reusing it
        double sum = add(1, 2);
        System.out.println("The sum is: " + sum);

        // you can call the method inline if you don't plan on reusing the method call result
        System.out.println("The difference is: " + Calculator.subtract(4.7, 3.8));

        boolean result = isEven(9);
        System.out.println("The number 9 is even. " + result);

        System.out.println("The number 2 is even. " + Calculator.isEven(2));

        int winner = Calculator.randInt();
        System.out.println("Your winner is contestant number: " + winner);

        System.out.println("Your random number is: " + Calculator.randInt());

        System.out.println("Your random number between inputs is: " +Calculator.randInt(3 , 5));

        System.out.println("random num between 1 and input: " + Calculator.randInt(78));
        System.out.println();

        double avg = Calculator.average(5,3,2,34,5,64,434,323,233,4);
        System.out.println("The average is: " + avg);

        int[] ages = {4, 3, 2, 4, 3, 4, 5, 60 };
        double avg2 = Calculator.average(5, ages);
        System.out.println("The average when array is passed is: " + avg2);

        double avg3 = Calculator.average(2);
        System.out.println(avg3); // returns NaN bc we divide 0/0
    }
}