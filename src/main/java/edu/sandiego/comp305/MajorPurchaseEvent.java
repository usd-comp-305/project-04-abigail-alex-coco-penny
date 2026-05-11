package edu.sandiego.comp305;

import java.nio.file.FileSystemNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class MajorPurchaseEvent implements FinancialLifeEvent {

    private String description;
    private double purchasePrice;

    public MajorPurchaseEvent(String description, double purchasePrice) {
        this.description = description;
        this.purchasePrice = purchasePrice;
    }

    @Override
    public void executeOn(Person person, Scanner scanner, Random random) {

        System.out.println("Major Purchase: " + description);
        System.out.println("Would you like to purchase for $" + purchasePrice + "? (y/n) ");

        String purchaseDecision = scanner.nextLine().toLowerCase();

        if(purchaseDecision.equals("y")) {
            person.setBankBalance(person.getBankBalance() - purchasePrice);
            System.out.println("Your updated bank balance is: $" + person.getBankBalance());
        }



    }



}
