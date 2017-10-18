package com.company;


public class Firm {
    private AEmployee[] employees;


    public AEmployee[] getEmployees() {
        return employees;
    }

    public void setEmployees(AEmployee[] employees) {
        this.employees = employees;
    }

    public Firm(int sise) {
        this.employees = new AEmployee[sise];
    }

    public void add(AEmployee employee, Checker checker, Printer printer) {

        if (checker.checkLength(employees) == true) {

            employees[checker.checkNumber(employees)] = employee;
        } else printer.printError();

    }

    public void totalSalary(Printer printer) {

        double total = 0;

        for (int i = 0; i < employees.length; i++) {

            total = total + employees[i].getSalary();


        }

        printer.print(total);
    }
}
