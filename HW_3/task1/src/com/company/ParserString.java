package com.company;


public class ParserString implements IParserString {
    @Override
    public String[] parser(String myString) {
        String[] massifText = myString.split(" ");
        return massifText;
    }
}
