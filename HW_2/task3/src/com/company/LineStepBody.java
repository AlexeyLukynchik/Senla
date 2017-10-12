package com.company;


public class LineStepBody implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        System.out.println("I pass the part");
        return new Body("Pinskdrev");
    }
}
