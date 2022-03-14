package io.tests;

import com.time.AlarmClock;
import org.gelato.IceCreamFlavor;

import java.util.Arrays;

class ArraysTest {

    public static void main(String[] args) {
        int[] ages = new int[5];
        ages[0] = 27;
        ages[1] = 23;
        ages[2] = 47;
        ages[3] = 45;
        ages[4] = 9;

        double[] ratings = {3.5 , 5.0 , 4.3, 3.8, 4.1, 4.7, 2.1, 0.3};

        String[] titles = {"The Batman" , "Twilight" , "Zombie Rampage 2"};

        System.out.println(ages); // toString() is automatically called - array does not have methods
        System.out.println(ratings);
        System.out.println(titles);

        System.out.println();

        System.out.println(Arrays.toString(ages)); // Arrays utility class with toString() prints our array
        System.out.println(Arrays.toString(ratings));
        System.out.println(Arrays.toString(titles));
        System.out.println();

        AlarmClock[] clocks = new AlarmClock[3]; // array from a class we created earlier
        clocks[0] = new AlarmClock(4, 6);
        clocks[1] = new AlarmClock(7, 7);
        clocks[2] = new AlarmClock(10, 3);

        System.out.println(Arrays.toString(clocks));
        System.out.println();

        AlarmClock[] aClocks = {new AlarmClock(5, 3),
                                new AlarmClock(8 ,3),
                                new AlarmClock(6 , 4)};
        System.out.println(Arrays.toString(aClocks));

        IceCreamFlavor[] flavors = {IceCreamFlavor.COOKIE_MONSTER, IceCreamFlavor.CHOCOLATE};
        for (IceCreamFlavor flavor : flavors) {
            System.out.println(flavor);
        }
    }

}