package com.company;


public class APassenger {
    private String surname;

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public APassenger(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "APassenger{" +
                "surname='" + surname + '\'' +
                '}';
    }
}
