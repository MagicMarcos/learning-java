package com.duckrace.client;

import com.duckrace.DuckRacer;
import com.duckrace.Reward;

import java.util.Arrays;

class DuckRacerTest {
    public static void main(String[] args) {
        DuckRacer racer = new DuckRacer(1, "Marcos");

        System.out.println(racer.getName() + " has won " + racer.getWins() + " races!");

        racer.win(Reward.DEBIT_CARD);
        racer.win(Reward.DEBIT_CARD);
        racer.win(Reward.DEBIT_CARD);
        racer.win(Reward.DEBIT_CARD);
        racer.win(Reward.DEBIT_CARD);

        System.out.println(racer.getName() + " has won " + racer.getWins() + " races!");

        // TODO: find out which rewards a racer has chosen
        System.out.println(racer.getName() + " has these rewards: " + Arrays.toString(racer.getRewards()));

        // show toString() in action
        System.out.println(racer);
    }
}