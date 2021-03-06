package com.duckrace;

/*
 * Lookup table of ids to student names
 * When a DuckRacer wins for the first time we need to find out who that is.
 *
 * Map<Integer,String> StudentIdMap
 * id           name
 * --           ----
 * 1           Cat
 * 2           Chris
 * 3           David
 *
 * We need some sort of data structure to hold our race results
 * This collection should facilitate easy lookup and retrieval of DuckRacers,
 * so we can easily update the collection with new winners.
 *
 * Map<Integer,DuckRacer> racerMap
 * id           DuckRacer
 * --           ---------
 *              id      name        wins        rewards
 * 17           17      Phil         8          PRIZES, PRIZES
 * 12           12      Marcos       1          PRIZES
 *  5            5      Mannie       2          PRIZES, PRIZES
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Board {
    private static final String studentIdPath = "data/student-ids.csv";

    private Map<Integer,String> studentIdMap = loadStudentIdMap();
    private Map<Integer,DuckRacer> racerMap = new TreeMap<>();

    /*
     * Updates the board (Map) with the given id and Reward
     * 1. Find out if the given id it already in the map
     *      a. if so, retrieve the DuckRacer next to that id and make it "win" the given Reward
     *      b. if not, create new DuckRacer with that id, and make it win the given Reward, and
     *         insert the racer into the map
     */
    public void update(int id, Reward reward) {
        DuckRacer racer = null; // either pulled from the map (if existing) or new (if not)

        if(racerMap.containsKey(id)) {  // id in Map -> fetch racer
            racer = racerMap.get(id);
        } else {                        // id not in Map -> create racer
            racer = new DuckRacer(id ,studentIdMap.get(id));
            racerMap.put(id, racer);
        }
        // make it win
        racer.win(reward);
    }

    /*
     * Reads data/student-ids.cvs, parses each line of text into id and name
     * populates this map with those values and returns it.
     */
    private Map<Integer,String> loadStudentIdMap() {
        Map<Integer,String> idMap = new HashMap<>();

        try {
            List<String> lines = Files.readAllLines(Paths.get(studentIdPath));

            for (String line : lines) {
                String[] tokens = line.split(",");
                Integer id = Integer.valueOf(tokens[0]); // parseInt could work too due to autoboxing (int -> Integer)
                String name = tokens[1];
                idMap.put(id, name);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return idMap;
    }

    public void dumpStudentIdMap(){
        System.out.println(studentIdMap);
    }

    public void dumpRacerMap(){

        Collection<DuckRacer> racers = racerMap.values();
        for (DuckRacer racer : racers) {
            System.out.println(racer);
        }
    }
}