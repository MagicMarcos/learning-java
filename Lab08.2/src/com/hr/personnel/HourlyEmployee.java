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
       this(name, hireDate);  // go "next door" before going "upstairs"
       setRate(rate);
       setHours(hours);
    }

    // business methods
    @Override
    public void pay(){
        System.out.println(getName() + " is paid hourly $" + getRate() * getHours());
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
    @Override //Overrides employee.toString() -- warns if anything is wrong with override method
    public String toString(){
        return super.toString() + ", rate: $" + getRate() + ", hours: " + getHours();
    }
}