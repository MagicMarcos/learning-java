package io.tests;

import org.gelato.IceCreamFlavor;
import static org.gelato.IceCreamFlavor.*;


import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class MapTest {
    public static void main(String[] args) {
        Map<IceCreamFlavor, Double> flavorCost = new HashMap<>();

        flavorCost.put(BLACKBERRY , 5.00);
        flavorCost.put(STRAWBERRY_CHEESECAKE, 6.50);
        flavorCost.put(CHOCOLATE, 3.50);
        flavorCost.put(BUTTER_PECAN, 4.50);
        flavorCost.put(ROCKY_ROAD, 5.55);
        flavorCost.put(MOOSE_TRACKS, 8.33);

        // use case 1: use this to compute average cost
        Collection<Double> costs = flavorCost.values();
        double sum = 0.0;
        for (double cost : costs) {
            sum += cost;
        }

        double average = sum / costs.size();

        System.out.println("\nthe average cost is $" + average);
        System.out.println();

        // use case 2: write a simple "report" of flavor names and their costs
//        for (Map.Entry<IceCreamFlavor, Double> entry : flavorCost.entrySet()) {
        for (var entry : flavorCost.entrySet()) { // here we can use var instead

        // Blackberry costs $5.0
            System.out.println(entry.getKey() + " costs $" + entry.getValue());

        }
    }
}