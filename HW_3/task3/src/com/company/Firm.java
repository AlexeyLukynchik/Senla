package com.company;


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

    public void totalSalary() {

        double total = 0;

        for (int i = 0; i < employees.length; i++) {

            total = total + employees[i].getSalary();


        }
        System.out.println("Total = " + total);
    }
}
