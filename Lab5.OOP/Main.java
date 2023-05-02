package org.example;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.id = 1;
        customer.name = "Nicat";
        customer.creditLimit = 100;
        customer.payment = 10;
        customer.action();

        Employee employee = new Employee();
        employee.id = 2;
        employee.name = "Zamiq";
        employee.job = "Software Engineer";
        employee.salary = 6000;
        employee.action();
    }
}