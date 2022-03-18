/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.javatunes.catalog.test;

import com.javatunes.catalog.Catalog;
import com.javatunes.catalog.InMemoryCatalog;
import com.javatunes.catalog.MusicCategory;
import static com.javatunes.catalog.MusicCategory.*;
import com.javatunes.catalog.MusicItem;

import java.util.ArrayList;
import java.util.Collection;

class InMemoryCatalogTest {

    /*
     * One by one, complete each test method below, and then "activate" it by
     * uncommenting the call to that method in main().
     *
     * Once you see that the test method verifies the corresponding business method
     * works correctly, you can comment out that call in main() and proceed to the next one.
     */
    public static void main(String[] args) {
        // testFindById();          // DONE!
        // testFindByKeyword();
        // testFindByCategory();    // DONE!
        // testSize();              // DONE!
        // testGetAll();

        // testFindSelfTitled();    // DONE!
        // testFindCheapRock();     // DONE!
        // testHowMany();           // DONE!
        // testAveragePrices();     // DONE!
        // testCheapestInGenre();   // DONE!
    }



    private static void testFindSelfTitled() {
        Catalog calalog = new InMemoryCatalog();

        Collection<MusicItem> selfTitled = calalog.findSelfTitled();

        dump(selfTitled);
    }

    private static void testFindCheapRock() {
        Catalog calalog = new InMemoryCatalog();
        double price = 15.5;
        Collection<MusicItem> cheapRock = calalog.findCheapRock(price);

        dump(cheapRock);
    }

    private static void testHowMany() {
        Catalog catalog = new InMemoryCatalog();

        int amount = catalog.howMany(RAP);

        System.out.println(amount);
    }

    private static void testAveragePrices() {
        Catalog catalog = new InMemoryCatalog();

        double average = catalog.averagePrices();
        System.out.println(average);

        double genreAvg = catalog.averagePrices(POP);
        System.out.println(genreAvg);
    }



    private static void testCheapestInGenre() {
        InMemoryCatalog catalog = new InMemoryCatalog();
        System.out.println(catalog.cheapestInGenre(POP));
    }

    //======================================== ^ move-to-bottom ^ =====================================

    private static void testFindById() {
        Catalog catalog = new InMemoryCatalog();

        MusicItem found = catalog.findById(6L); // autoboxes to int so we must explicitly state 6L (long)
        System.out.println("found -> " + found);

        MusicItem notFound = catalog.findById(89L); // should return null
        System.out.println("not-found  -> " + notFound);
    }

    private static void testFindByKeyword() {
    }

    private static void testFindByCategory() {
        Catalog catalog = new InMemoryCatalog();

        Collection<MusicItem> items = catalog.findByCategory(ROCK);
        dump(items); // private method to return collection

        Collection<MusicItem> jazzItems = catalog.findByCategory(JAZZ);
        dump(jazzItems); // should return empty collection
    }

    private static void testSize() {
        Catalog catalog = new InMemoryCatalog();

        System.out.println(catalog.size());
    }

    private static void testGetAll() {
    }

    private static void dump(Collection<MusicItem> items) {
        for (MusicItem item : items) {
            System.out.println(item);
        }
    }
}