package com.duckrace;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DuckRacer {
    // fields
    private int id;
    private String name;
    //    private int wins; -- not needed as we can use length property of Reward[]
    private Collection<Reward> rewards = new ArrayList<>();

    // constructors
    public DuckRacer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // business methods
    public void win(Reward reward) {
        rewards.add(reward);
    }

    // accessor methods

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return rewards.size();
    }

    public List<Reward> getRewards() {
        return (List<Reward>) rewards;
    }

    // toString()
    public String toString() {
        return "DuckRacer: " +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", rewards= " + getRewards() +
                ", number of wins= " + getWins() +
                '.';
    }
}