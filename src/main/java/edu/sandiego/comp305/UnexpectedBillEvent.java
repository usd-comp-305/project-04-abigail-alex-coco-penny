package edu.sandiego.comp305;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.abs;

public class UnexpectedBillEvent implements FinancialLifeEvent {

    private String description;

    private double cost;

    public UnexpectedBillEvent(final String description, final double cost) {
        this.description = description;
        this.cost = cost;
    }

    @Override
    public void executeOn(final Character person, final Scanner scanner, final Random random) {
        System.out.println("Unexpected Bill: " + description);
        System.out.println("You must pay $" + cost + "\n");
        person.setBankBalance(person.getBankBalance() -  this.cost);

        if(person.getBankBalance() < 0) {
            System.out.println("You are bankrupt! You owe the bank $"+ abs(person.getBankBalance()) + "\n");
        }

    }
}
