package edu.sandiego.comp305;

import java.util.Random;
import java.util.Scanner;

public class MajorPurchaseEvent implements FinancialLifeEvent {

    private String description;

    private double purchasePrice;

    public MajorPurchaseEvent(final String description, final double purchasePrice) {
        this.description = description;
        this.purchasePrice = purchasePrice;
    }

    @Override
    public void executeOn(final Character person, final Scanner scanner, final Random random) {

        System.out.println("Major Purchase: " + description);
        System.out.println("Would you like to purchase for $" + purchasePrice + "? (y/n) \n");

        final String purchaseDecision = scanner.nextLine().toLowerCase();

        if(purchaseDecision.equals("y")) {
            person.setBankBalance(person.getBankBalance() - purchasePrice);

            if(person.getBankBalance() < 0) {
                System.out.println("You are bankrupt!\n");
            }

            System.out.println("Your updated bank balance is: $" + person.getBankBalance() + "\n");
        }



    }



}
