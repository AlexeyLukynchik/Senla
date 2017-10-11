package com.company;

/**
 * Created by Алексей on 07.10.2017.
 */
public class AssemblyLine implements IAssemblyLine {
    ILineStep body;
    ILineStep mother;
    ILineStep monitor;

    public AssemblyLine(ILineStep body, ILineStep mother, ILineStep monitor) {

        this.body = body;
        this.mother = mother;
        this.monitor = monitor;


    }

    @Override
    public IProduct assembleProduct(IProduct newProduct) {

        System.out.println("I received a blank");


        newProduct.installFirstPart(body.buildProductPart());

        newProduct.installSecondPart(mother.buildProductPart());


        newProduct.installThirdPart(monitor.buildProductPart());


        System.out.println("I was born!");


        return newProduct;


    }
}
