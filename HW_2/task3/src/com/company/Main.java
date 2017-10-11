package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ILineStep body = new LineStepBody();
        ILineStep mother = new LineStepMotherboard();
        ILineStep monitor = new LineStepMonitor();


        AssemblyLine assemblyLine = new AssemblyLine(body, mother, monitor);
        assemblyLine.assembleProduct(new NewProduct());
        System.out.println();

    }
}
