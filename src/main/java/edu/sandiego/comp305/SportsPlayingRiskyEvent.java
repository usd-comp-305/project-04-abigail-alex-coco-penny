package edu.sandiego.comp305;

import java.util.Random;
import java.util.Scanner;

import static java.util.Random.*;

public class SportsPlayingRiskyEvent implements RiskyLifeEvent {


    private String description;

    private double cost;

    private double riskFactor;


    public SportsPlayingRiskyEvent(final String description, final double cost, double riskFactor) {
        this.description = description;
        this.cost = cost;
        this.riskFactor = riskFactor;
    }


    @Override
    public void executeOn(Person person, Scanner scanner, Random random) {
        System.out.println("Your friends are betting money on a round of sports ... ");
        System.out.println("Sport: " + description);
        System.out.println("Cost: " + cost);
        System.out.println("Risk Factor" + riskFactor);

        System.out.println("Would you like to take the risk? (y/n) \n");

        final String riskDecision = scanner.nextLine().toLowerCase();

        if(riskDecision.equals("y")) {

            person.setBankBalance(person.getBankBalance() - cost);

            double randomNum = random.nextDouble();

            double successRate = 1 - riskFactor;

            if (randomNum <= successRate) {
                double multiplier = 1 + (3*riskFactor);

                double returns = cost*multiplier;

                System.out.println("Congratulations, your team won the round! You have been awarded $" + returns);

                person.setBankBalance(person.getBankBalance() + returns);
            }

            else {
                System.out.println("Unfortunately, your team has lost this round ... ");
            }


            System.out.println("Your updated bank balance is: $" + person.getBankBalance() + "\n");
        }


    }
}
