package org.gelato;

public enum IceCreamFlavor {
    BLACKBERRY("Blackberry"),
    BUTTER_PECAN("Butter Pecan"),
    CHOCOLATE("Chocolate"),
    STRAWBERRY_CHEESECAKE("Strawberry Cheesecake"),
    ROCKY_ROAD("Rocky Road"),
    COOKIE_MONSTER("Cookie Monster"),
    MOOSE_TRACKS("Moose Tracks");

    //-----------------------------------------------------------------------
    //under this line, it's all regular class definition stuff (field, ctor, methods).
    private final String display;

    // constructor
    IceCreamFlavor(String display) {
        System.out.println("org.gelato.IceCreamFlavor ctor called"); // shows all enums are created
        this.display = display;
    }

    // accessor method for display
    public String display(){
        return display;
    }

    public String toString(){
        return display();
    }
}
