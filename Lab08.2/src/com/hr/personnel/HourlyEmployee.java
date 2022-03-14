package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    // fields
    double rate;

    double hours;

    // constructors
    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate); // Delelegate to superclass ctor
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
       super(name, hireDate);
       setRate(rate);
       setHours(hours);
    }

    // accessor methods
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    // to String
    public String toString(){
        return "Hourly Employee \n Name: " + getName() + ", hireDate: " + getHireDate() +
                ", rate: $" + getRate() + ", hours: " + getHours();
    }
}