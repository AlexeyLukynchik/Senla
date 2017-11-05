package com.company.essence;

import java.util.Date;


public class Client extends Entity {
    private Integer ID ;
    private String surname;
    private Date dateArrival;
    private Date dateEviction;

    public Client(Integer ID,String surname, Date dateArrival, Date dateEviction) {
         this.ID =ID ;
        this.surname = surname;
        this.dateArrival = dateArrival;
        this.dateEviction = dateEviction;
    }

    @Override
    public String toString() {
        return "Client{" +
                "ID=" + ID +
                ", surname='" + surname + '\'' +
                ", dateArrival=" + dateArrival +
                ", dateEviction=" + dateEviction +
                '}';
    }

    public Integer getID() {

        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateArrival() {
        return dateArrival;
    }

    public void setDateArrival(Date dateArrival) {
        this.dateArrival = dateArrival;
    }

    public Date getDateEviction() {
        return dateEviction;
    }

    public void setDateEviction(Date dateEviction) {
        this.dateEviction = dateEviction;
    }
}
