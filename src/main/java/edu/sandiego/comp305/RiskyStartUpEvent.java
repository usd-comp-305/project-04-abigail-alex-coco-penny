package edu.sandiego.comp305;

import java.util.Random;
import java.util.Scanner;

public class RiskyStartUpEvent implements RiskyLifeEvent {

    private String description;

    private int cost;

    private double riskFactor;


    // modify this to take in risk factor as a parameter to make the probability dynamic

    public RiskyStartUpEvent(String description, int cost, double riskFactor) {
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

        String riskChoice = scanner.nextLine().toLowerCase();

        if(riskChoice.equals("y")) {

            person.setBankBalance(person.getBankBalance() - cost);

            double randomProbability = random.nextDouble();

            double successRate = 1 - riskFactor;

            if (randomProbability <= successRate) {

                double multiplier = 1 + ( 3 * riskFactor);

                double returns = cost * multiplier;

                System.out.println("Your company is doing well! You have made $" + returns);
                person.setBankBalance(person.getBankBalance() + returns);
            }
            else {

                double multiplier = 1 - riskFactor;
                double returns = cost * multiplier;
                System.out.println("Your company has gone bankrupt ... you have lost $" + returns);
                person.setBankBalance(person.getBankBalance() - returns);
            }
            System.out.println("Your current bank balance is $" + person.getBankBalance());

        }

    }

}
