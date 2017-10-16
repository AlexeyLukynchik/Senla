package com.company;


public class AEmployee {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    private Double salary;

    public Double getSalary() {
        return salary;
    }


    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void outputMessage() {

        System.out.println("I am " + getName());

    }

    public AEmployee(String name, String surname, String position, Double salary) {
        this.name = name;
        this.surname = surname;
        this.position = position;
        this.salary = salary;

    }
}
