package com.company;


public class Output implements IOutput {
    @Override
    public void output(String[] outputText) {
        for (int i = 0; i < outputText.length; i++) {
            System.out.println(outputText[i]);
        }
    }
}
