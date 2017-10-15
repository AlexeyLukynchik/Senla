package com.company;


public class Firm {
    private Employee[] employees;


    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Firm(Employee[] employees) {
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
