package com.company;


public class LineStepMonitor implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        System.out.println("I pass the part");
        return new Monitor("Integral");
    }
}
