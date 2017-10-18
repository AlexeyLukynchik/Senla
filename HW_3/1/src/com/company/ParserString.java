package com.company;


public class ParserString {
    public void parse(String myString, Printer printer) {
        String[] massifText = myString.split(" ");
        printer.doPrint(massifText);
    }
}
