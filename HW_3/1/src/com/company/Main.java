package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Printer printer = new Printer();
        ParserString parserString = new ParserString();
        String stringForParse = "mama myla ramu rama myla mamu";
        parserString.parse(stringForParse, printer);

    }
}
