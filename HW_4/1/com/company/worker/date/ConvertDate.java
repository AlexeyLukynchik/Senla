package com.company.worker.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Алексей on 01.11.2017.
 */
public class ConvertDate {

    public Date convertDate(String str) throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
        Date date = dateFormat.parse(str);

        return date;


    }
}
