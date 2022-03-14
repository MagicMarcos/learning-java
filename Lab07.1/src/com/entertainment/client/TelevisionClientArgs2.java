package com.entertainment.client;/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import com.entertainment.DisplayType;
import com.entertainment.Television;

/**
 * Intended usage (by human):
 *  $ java com.entertainment.client.TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java com.entertainment.client.TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of com.entertainment.Television with the specifications (values) provided by the user.
 */
class TelevisionClientArgs2 {

    public static void main(String[] args) {

        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");

        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType displayType = DisplayType.valueOf(args[2]);


        switch (args.length){
            case 3:
                new Television(brand, volume , displayType);
            case 2:
                new Television(brand, volume);
            case 1:
                new Television(brand);
                break;
            default:
                String usage = "Usage: java com.entertainment.client.TelevisionClientArgs <brand> <volume> <display>";
                String example = "Example: java com.entertainment.client.TelevisionClientArgs Samsung 32 PLASMA";
                String note = "Note: supported displays are LED, OLED, LCD, CRT, PLASMA";
                System.out.println(usage);
                System.out.println(example);
                System.out.println(note);
        }

    }

}