package com.duckrace;


import java.lang.reflect.Array;
import java.util.Arrays;

public class DuckRacer {
    // fields
    private int id;
    private String name;
//    private int wins; -- not needed as we can use length property of Reward[]
    private Reward[] rewards = new Reward[25];  // populate with 25 nulls
    private int currentIndex = 0;               // position of the next Reward

    // constructors
    public DuckRacer(int id , String name) {
        this.id = id;
        this.name = name;
    }

    // business methods
    public void win(Reward reward){
        rewards[currentIndex ++] = reward;
    }

    // accessor methods

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return currentIndex;
    }

    /*
     * Returns the rewards this duck racer has chosen so far
     * Note the returned array should not contain null, just the filled in slots
     */
    public Reward[] getRewards(){
        return Arrays.copyOf(rewards, currentIndex);
    }

    // toString()
    public String toString() {
        return "DuckRacer: " +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", rewards= " + Arrays.toString(getRewards()) +
                ", number of wins= " + currentIndex +
                '.';
    }
}