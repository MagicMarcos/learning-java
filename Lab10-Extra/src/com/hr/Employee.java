package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS
    /*
     * OPTION1: Try/Catch and handle -> exception stops here - doesn't go to client

    public void goToWork() {
        Car c = new Car("abc123" , "Toyota", "Tacoma");

        try {
            c.start();
            c.moveTo("West Seattle");
            System.out.println("Arrived at work");
        }
        catch (DestinationUnreachableException e) {
            System.out.println(e.getMessage()); // toString() automatically called
        }
        finally {
            c.stop();
        }
    }
     */

    /*
     * OPTION2: Punt -> do not try-catch the exception -- something else must handle it
     * NOTE: because the exception is checked, we can punt, BUT we MUST say "throws"
     * Try/Finally ensures that c.stop() executes

    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("abc123", "Toyota", "Tacoma");

        try {
            c.start();
            c.moveTo("West Seattle");
            System.out.println("Arrived at work");
        }
        finally {
            c.stop();
        }
    }
     */

    /*
     * OPTION 3: try/catch, do "something" in response to the exception but RETHROW it
     * NOTE: since the exception is checked, we must "announce" in the 'throws' clause

    public void goToWork() throws DestinationUnreachableException {
        Car c = new Car("abc123" , "Toyota", "Tacoma");

        try {
            c.start();
            c.moveTo("West Seattle");
            System.out.println("Arrived at work");
        }
        catch (DestinationUnreachableException e) {
            // email city council with complaints about stupid bridge!
            throw e; // catch and rethrow
        }
        finally {
            c.stop();
        }
    }
     */

    /*
     * OPTION4: try-catch and throw a different one -- "nested" exception
     * AKA exception chaining
     */
    public void goToWork() throws WorkException{
        Car c = new Car("abc123" , "Toyota", "Tacoma");

        try {
            c.start();
            c.moveTo("West Seattle");
            System.out.println("Arrived at work");
        }
        catch (DestinationUnreachableException e) {
            // "wrap" or "nest" the CAUSE in a high-level HR(package)-oriented exception
            throw new WorkException( "Unable to get to work, transportation problems." , e);
        }
        finally {
            c.stop();
        }
    }

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}