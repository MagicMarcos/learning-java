package org.gelato;

class IceCreamFlavorClient {

    public static void main(String[] args) {
        String flavorInput = "CHOCOLATE";
        IceCreamFlavor flavor = IceCreamFlavor.valueOf(flavorInput); // input needs to be caps to match the ENUM

        // System.out.println("My favorite flavor is " + org.gelato.IceCreamFlavor.COOKIE_MONSTER);
    }
}