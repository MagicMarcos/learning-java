/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.Department;
import com.hr.personnel.Employee;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it - we can't directly instantiate Employee like before
        //dept.addEmployee(new Employee("Jason", LocalDate.of(1990, 8, 24)));
        //dept.addEmployee(new Employee("Julie", LocalDate.of(2000, 2, 2)));

        dept.addEmployee(new SalariedEmployee("Jason", LocalDate.of(1990, 8, 24), 177000.44));
        dept.addEmployee(new HourlyEmployee("Julie", LocalDate.of(2000, 2, 2), 55.5 ,40.0));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        System.out.println("-------------------------------------------------------------");

        dept.addEmployee(new SalariedEmployee("Baggie", LocalDate.of(2005, 2, 4), 1000000.32));
        dept.addEmployee(new HourlyEmployee("Marcos", LocalDate.of(1994, 9, 1), 3.50, 80.33 ));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        // pay the employees
        System.out.println("\nPay employees:");
        dept.payEmployees();
    }
}