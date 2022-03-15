/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import gov.irs.IllegalWageException;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    // static fields
    public static double FEDERAL_MINIMUM_WAGE = 15.00;

    // fields
    private double rate;
    private double hours;

    // constructors
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);  // delegate to superclass ctor for name, hireDate
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) throws IllegalArgumentException {
        this(name, hireDate);   // delegate to neighboring ctor for name, hireDate
        setRate(rate);          // handle rate here, by delegating to setter
        setHours(hours);        // handle hours here, by delegating to setter
    }

    // business methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid hourly " + (getRate() * getHours()));
    }

    @Override  // interface TaxPayer
    public void payTaxes() {
        double taxes = getRate() * getHours() * HOURLY_TAX_RATE;
        System.out.println(getName() + " paid taxes of " + taxes);
    }

    // accessor methods
    public double getFederalMinimumWage(){
        return FEDERAL_MINIMUM_WAGE;
    }


    // May throw an IllegalArgumentException : THIS IS AN UNCHECKED EXCEPTION
    public void setRate(double rate) throws IllegalArgumentException {
        if(rate < getFederalMinimumWage()){
            throw new IllegalArgumentException("Rate $" + rate + " must be at least the Federal Min Wage of $" +
                    getFederalMinimumWage());
        } else {
            this.rate = rate;
        }
    }

    /*
    // May throw an IllegalWageException: THIS IS A CHECKED EXCEPTION
    public void setRate(double rate) throws IllegalWageException {
        if(rate < getFederalMinimumWage()){
            throw new IllegalWageException("Rate $" + rate + " must be at least the Federal Min Wage of $" +
                    getFederalMinimumWage());
        } else {
            this.rate = rate;
        }
    }
     */

    public double getRate() {
        return rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return super.toString() + ", rate=" + getRate() + ", hours=" + getHours();
    }
}