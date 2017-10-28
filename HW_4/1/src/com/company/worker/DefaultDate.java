package com.company.worker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Алексей on 25.10.2017.
 */
public class DefaultDate {

   static final String DEFAULT_DATE ="2000.12.31";


    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");

    private Date defaultDate;

    public DefaultDate() throws ParseException {
        this.defaultDate = dateFormat.parse(DEFAULT_DATE);
    }

    public Date getDefaultDate() {

        return defaultDate;
    }

    public void setDefaultDate(Date defaultDate) {
        this.defaultDate = defaultDate;
    }
}
