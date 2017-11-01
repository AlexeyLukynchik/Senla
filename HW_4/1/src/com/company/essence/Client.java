package com.company.essence;

import java.util.Date;


public class Client extends Entity {
    private Integer numberRoom = 0;
    private String surname;
    private Date dateArrival;
    private Date dateEviction;

    public Client(String surname, Date dateArrival, Date dateEviction) {
        // this.numberRoom =numberRoom ;
        this.surname = surname;
        this.dateArrival = dateArrival;
        this.dateEviction = dateEviction;
    }

    @Override
    public String toString() {
        return "Client{" +
                "numberRoom=" + numberRoom +
                ", surname='" + surname + '\'' +
                ", dateArrival=" + dateArrival +
                ", dateEviction=" + dateEviction +
                '}';
    }

    public Integer getNumberRoom() {

        return numberRoom;
    }

    public void setNumberRoom(Integer numberRoom) {
        this.numberRoom = numberRoom;
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
