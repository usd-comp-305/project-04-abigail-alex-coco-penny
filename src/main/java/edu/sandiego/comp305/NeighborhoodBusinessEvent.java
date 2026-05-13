package edu.sandiego.comp305;

import java.util.Random;
import java.util.Scanner;

public class NeighborhoodBusinessEvent implements RiskyLifeEvent{

    final private String description;

    final private double cost;

    final private double riskFactor;

    public NeighborhoodBusinessEvent(final String description, final double cost, final double riskFactor) {
        this.description = description;
        this.cost = cost;
        this.riskFactor = riskFactor;
    }

    @Override
    public void executeOn(Character person, Scanner scanner, Random random) {
        System.out.println("You want to start a neighborhood business!");
        System.out.println("Business Idea " + description);
        System.out.println("Risk Factor: " + riskFactor);

        System.out.println("Would you like to take the risk ? (y/n) \n");

        final String riskChoice = scanner.nextLine().toLowerCase();

        if(riskChoice.equals("y")) {

            person.setBankBalance(person.getBankBalance() - cost);

            final double randomProbability = random.nextDouble();

            final double successRate = 1 - riskFactor;

            if (randomProbability <= successRate) {

                final double multiplier = 1 + ( 2 * riskFactor);

                final double returns = cost * multiplier;

                System.out.println("Your business is doing well! Your returns are $" + returns);
                person.setBankBalance(person.getBankBalance() + returns);
            } else {
                System.out.println("Unfortunately, business has not been going great, you have lost $" + cost);
            }
            System.out.println("Your current bank balance is $" + person.printedFormatBankBalance());

        }
    }
}
