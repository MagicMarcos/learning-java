package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    //Fields
    double salary;

    // constructors
    public SalariedEmployee() {
        // there is an implicit call to super() in this constructor
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate); // delegate to superclass ctor for name, hireDate

        // registerInRetirementPlan();

    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        // use this() instead of super() so if we need any other methods (see above ex) we only need to write it once
        this(name, hireDate); // delegate to neighboring ctor -- it delegates to superclass
        setSalary(salary);
    }

    // business methods
    @Override
    public void pay(){
        System.out.println(getName() + " is paid salary $" + getSalary());
    }

    // accessor methods
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString()
    @Override // overrides the Employee toString() method
    public String toString(){
        return super.toString() + ", salary: $" + getSalary() ;
    }
}