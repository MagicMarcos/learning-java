package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    //Fields
    double salary;

    // constructors
    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate); // delegate to superclass ctor for name, hireDate
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
        setSalary(salary);
    }

    // accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString()
    public String toString(){
        return "Salaried Employee \n Name: " + getName() + ", hireDate: " + getHireDate() +
                ", salary: $" + getSalary() ;
    }
}