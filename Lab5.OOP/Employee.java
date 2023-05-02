package org.example;

public class Employee extends Human {
    public String job;
    public double salary;

    @Override
    public void action(){
        System.out.println("Action method for Employee");
    }
}
