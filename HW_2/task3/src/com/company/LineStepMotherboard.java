package com.company;


public class LineStepMotherboard implements ILineStep {

    @Override
    public IProductPart buildProductPart() {
        System.out.println("I pass the part");
        return new Motherboard("Horizont");
    }
}
