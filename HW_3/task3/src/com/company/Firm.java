package com.company;

/**
 * Created by Алексей on 16.10.2017.
 */
public class Firm {
    private AEmployee[] employees;


    public AEmployee[] getEmployees() {
        return employees;
    }

    public void setEmployees(AEmployee[] employees) {
        this.employees = employees;
    }

    public Firm(AEmployee[] employees) {
        this.employees = employees;
    }

    public double totalSalary() {

        double total = 0;

        for (int i = 0; i < employees.length; i++) {

            total = total + employees[i].getSalary();


        }

        return total;
    }
}
