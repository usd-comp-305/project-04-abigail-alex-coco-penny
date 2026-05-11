package edu.sandiego.comp305;

import java.util.Scanner;

import static java.lang.Math.abs;

public class UnexpectedBillEvent implements FinancialLifeEvent {

    private String description;
    private double cost;

    public UnexpectedBillEvent(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    @Override
    public void executeOn(Person person, Scanner scanner) {
        System.out.println("Unexpected Bill: " + description);
        System.out.println("You must pay $" + cost + "\n");
        person.setBankBalance(person.getBankBalance() -  this.cost);

        if(person.getBankBalance() < 0) {
            System.out.println("You are bankrupt! You owe the bank $"+ abs(person.getBankBalance()) + "\n");
        }

    }
}
