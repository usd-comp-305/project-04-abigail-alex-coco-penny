package edu.sandiego.comp305;

import java.util.Random;
import java.util.Scanner;

public class RiskyGamblingEvent implements RiskyLifeEvent {

    final private String description;

    final private double cost;

    final private double riskFactor;

    public RiskyGamblingEvent(final String description, final double cost, final double riskFactor) {
        this.description = description;
        this.cost = cost;
        this.riskFactor = riskFactor;
    }

    @Override
    public void executeOn(Character person, Scanner scanner, Random random) {
        System.out.println("Your friends invited you gambling ... ");
        System.out.println("Game: " + description);
        System.out.println("Risk Factor: " + riskFactor);

        System.out.println("Would you like to take the risk ? (y/n) \n");

        final String riskChoice = scanner.nextLine().toLowerCase();

        if(riskChoice.equals("y")) {

            person.setBankBalance(person.getBankBalance() - cost);

            final double randomProbability = random.nextDouble();

            final double successRate = 1 - riskFactor;

            if (randomProbability <= successRate) {

                final double multiplier = 1 + ( 3 * riskFactor);

                final double returns = cost * multiplier;

                System.out.println("You got lucky! You won $" + returns);
                person.setBankBalance(person.getBankBalance() + returns);
            } else {
                System.out.println("Unfortunately, luck was not on your side. You have lost $" + cost);
            }
            System.out.println("Your current bank balance is $" + person.printedFormatBankBalance());

        }

    }
}
