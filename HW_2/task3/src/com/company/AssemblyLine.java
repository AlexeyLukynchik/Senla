package com.company;

/**
 * Created by Алексей on 07.10.2017.
 */
public class AssemblyLine implements IAssemblyLine {
    @Override
    public IProduct assembleProduct(IProduct newProduct) {

      System.out.println("I received a blank");
        Body body = (Body) new LineStepBody().buildProductPart();


        newProduct.installFirstPart(body);
        Motherboard mother = (Motherboard) new LineStepMotherboard().buildProductPart();
        newProduct.installSecondPart(mother);
        Monitor monitor = (Monitor) new LineStepMonitor().buildProductPart();

        newProduct.installThirdPart(monitor);


        NewProduct NP = new NewProduct(body,mother,monitor );
        System.out.println("I was born!");
      return NP;


    }
}
