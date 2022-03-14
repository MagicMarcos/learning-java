package org.humans;

import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.of(1993, 10, 5);
        Person marcos = new Person("Marcos" , birthDate);
        System.out.println(marcos.getName() + " is " + marcos.getAge() + " years old.");
    }
}