package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String stringForParse = "mama myla ramu rama myla mamu";
        ParserString parserString = new ParserString();
        Output output = new Output();
        output.output(parserString.parser(stringForParse));
        //System.out.println();

    }
}
