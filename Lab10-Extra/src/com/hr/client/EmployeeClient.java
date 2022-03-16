package com.hr.client;

import com.hr.Employee;
import com.hr.WorkException;

public class EmployeeClient {

    public static void main(String[] args) {
        Employee emp = new Employee("Marcos");

        try {
            emp.goToWork();
        } catch (WorkException e) {
            // NOTE the packages on these exceptions
            System.out.println(e); // toString() called automatically
            System.out.println(e.getCause()); //  nested exception inside
            System.out.println();

            e.printStackTrace(); // automatically calls System.out. NOTE "Caused by:" in console
        }
    }
}