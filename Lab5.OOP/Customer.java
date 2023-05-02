package org.example;

public class Customer extends Human {
    public double creditLimit;
    public double payment;

    @Override
    public void action(){
        System.out.println("Action method for Customer");
    }
}
