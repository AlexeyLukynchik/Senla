package com.company;

/**
 * Created by Алексей on 07.10.2017.
 */
public class NewProduct implements IProduct {

    IProductPart newBody;
    IProductPart newMotherboard;
    IProductPart newMonitor;

    /* public   NewProduct(Body newBody, Motherboard newMotherboard, Monitor newMonitor ) {

           this.newBody = newBody;
           this.newMonitor = newMonitor;
           this.newMotherboard = newMotherboard;


       }*/
    NewProduct() {
    }


    @Override
    public void installFirstPart(IProductPart firstPart) {
        System.out.println("First part installed");
        this.newBody = firstPart;
    }

    @Override
    public void installSecondPart(IProductPart secondPart) {
        System.out.println("Second part installed");
        this.newMotherboard = secondPart;
    }

    @Override
    public void installThirdPart(IProductPart thirdPart) {
        System.out.println("Third part installed");
        this.newMonitor = thirdPart;
    }
}
