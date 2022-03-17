/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel;

import java.util.ArrayList;
import java.util.Collection;

/**
 * The Department class manages employees.
 *
 * Properties:
 *   String name
 *   String location
 *   Employee[] employees  the Employees in this department.
 *   int currentIndex      internal counter for number of employees in the department.
 *
 * Methods (excluding get/set methods):
 *   void listEmployees()  print info on all employees in the department.
 *   void workEmployees()  make all employees in the department work.
 *   String toString()     self-explanatory.
 */
public class Department {
    // fields
    private String name;
    private String location;
    Collection<Employee> employees = new ArrayList<>();

    // constructors
    public Department() {
    }

    public Department(String name, String location) {
        setName(name);
        setLocation(location);
    }

    // business methods
    public void listEmployees() {
        // Note: we don't use for-each here because we only want to access the array where employees were added.
        // Question: what is in the array for indices where no Employee was added?  null!
        for (Employee employee : employees) {
            System.out.println(employee);  // toString() automatically called
        }
    }

    public void workEmployees() {
        for (Employee employee : employees) {
            employee.work();
        }
    }

    public void payEmployees() {
        for (Employee employee : employees) {
            employee.pay();
        }
    }

    /**
     * Temporary office closure -> for all employees that take vacation:
     * make them take vacation
     * The rub: we can't call take vacation unless we have a reference type of Salaried Employee
     * we can "ask" each "Employee" what type it is though..
     * Once we know the type of employee we can call takeVacation()
     */
    public void holidayBreak(){
        for (Employee  employee : employees){
            if(employee instanceof SalariedEmployee) {
                // use Downcasting -> think downcasting from Double to Int in earlier lab
                // downcast Employee reference (employees[i]) to SalariedEmployee
                // SalariedEmployee methods can be called
                SalariedEmployee semp = (SalariedEmployee) employee;
                semp.takeVacation();
            }
        }
    }

    // helper method to add an Employee to the array
    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    // accessor methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String toString() {
        return "Department: name=" + getName() + ", location=" + getLocation();
    }
}