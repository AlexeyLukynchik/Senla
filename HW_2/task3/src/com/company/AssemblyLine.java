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
    public IProduct assembleProduct(IProduct laptop) {

        System.out.println("I received a blank");


        laptop.installFirstPart(body.buildProductPart());

        laptop.installSecondPart(mother.buildProductPart());


        laptop.installThirdPart(monitor.buildProductPart());


        System.out.println("I was born!");


        return laptop;


    }
}
