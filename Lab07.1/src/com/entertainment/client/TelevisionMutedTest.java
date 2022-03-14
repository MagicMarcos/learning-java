package com.entertainment.client;

import com.entertainment.Television;

class TelevisionMutedTest {
    public static void main(String[] args) {
        Television tv1 = new Television("LG" , 58);
        System.out.println(tv1);

        tv1.mute();                 // should mute
        System.out.println(tv1);

        tv1.mute();                 // should unmute and set old volume
        System.out.println(tv1);

        tv1.mute();                 // should mute
        System.out.println(tv1);

        tv1.setVolume(40);          // set new volume + unmute
        System.out.println(tv1);
    }
}