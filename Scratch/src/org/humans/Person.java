package org.humans;

import java.time.LocalDate;
import java.time.Period;

/**
 * A "immutable" class definition
 * Once created (with "new") there are no public methods available in Person objs
 * to change the values of their properties (fields).
 * NOTE: we don't have any public setters, so declaring instance variables as final is more
 * about stating your intentions, since with no setter they would be "final" regardless
 */

class Person {
    // instance variables (fields)
    private final String name;
    private final LocalDate birthDate;

    // constructor
    public Person(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
    };

    // accessor methods (read-only) -- getters, no setters
    // NOTE: we can use a private setter to validate
    /**
     * Returns the persons age in years.
     */
    public int getAge(){
        LocalDate today = LocalDate.now();
//        int age = today.compareTo(getBirthDate());
//        if(today.getMonthValue() < birthDate.getMonthValue()) {
//            age  -= 1;
//        }
//        return age;

        return Period.between(getBirthDate(), today).getYears();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public String toString() {
        // client can add \n if they want to
        return String.format("Person: Name = %s, Birth Date = %s, Age = %s", getName(), getBirthDate(), getAge());
    }
}