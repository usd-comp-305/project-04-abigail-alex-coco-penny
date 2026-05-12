package edu.sandiego.comp305;

import java.util.Random;
import java.util.Scanner;

public class RiskyStartUpEvent implements RiskyLifeEvent {

    final private String description;

    final private int cost;

    final private double riskFactor;


    // modify this to take in risk factor as a parameter to make the probability dynamic

    public RiskyStartUpEvent(final String description, final int cost, final double riskFactor) {
        this.description = description;
        this.cost = cost;
        this.riskFactor = riskFactor;
    }


    @Override
    public void executeOn(final Person person, final Scanner scanner, final Random random) {

        System.out.println("--- You want to make a new startup! ---\n");
        System.out.println("Business Idea: " + description);
        System.out.println("Total startup cost: " + cost);

        System.out.println("Would you like to take the risk ? (y/n) \n");

        final String riskChoice = scanner.nextLine().toLowerCase();

        if(riskChoice.equals("y")) {

            person.setBankBalance(person.getBankBalance() - cost);

            final double randomProbability = random.nextDouble();

            final double successRate = 1 - riskFactor;

            if (randomProbability <= successRate) {

                final double multiplier = 1 + ( 3 * riskFactor);

                final double returns = cost * multiplier;

                System.out.println("Your company is doing well! You have made $" + returns);
                person.setBankBalance(person.getBankBalance() + returns);
            } else {

                final double multiplier = 1 - riskFactor;
                final double returns = cost * multiplier;
                System.out.println("Your company has gone bankrupt ... you have lost $" + returns);
                person.setBankBalance(person.getBankBalance() - returns);
            }
            System.out.println("Your current bank balance is $" + person.getBankBalance());

        }

    }

}
