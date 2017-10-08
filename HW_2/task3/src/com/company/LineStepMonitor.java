package com.company;

/**
 * Created by Алексей on 07.10.2017.
 */
public class LineStepMonitor implements ILineStep {
    @Override
    public IProductPart buildProductPart() {
        System.out.println("I pass the part");
        return new Monitor("Integral");
    }
}
