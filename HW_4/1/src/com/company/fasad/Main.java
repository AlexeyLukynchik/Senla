package com.company.fasad;

import com.company.date.ConvertDate;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        String date = "2017.10.27";
        ConvertDate convertDate = new ConvertDate();
        Hotel hotel = new Hotel(convertDate.convertDate(date));

        hotel.workerInHotel(args);
        System.out.println();
    }
}
