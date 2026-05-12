package edu.sandiego.comp305;

import java.util.Random;
import java.util.Scanner;

public class RiskyAuditionEvent implements RiskyLifeEvent {
    final private String description;

    final private int cost;

    final private double acceptanceRate;



    public RiskyAuditionEvent(final String description, final int cost, final double acceptanceRate) {
        this.description = description;
        this.cost = cost;
        this.acceptanceRate = acceptanceRate;
    }


    @Override
    public void executeOn(final Person person, final Scanner scanner, final Random random) {

        System.out.println("--- A prestigious arts program is holding auditions ---\n");
        System.out.println("Role: " + description);
        System.out.println("Acceptance Rate: " + acceptanceRate);
        System.out.println("Total Audition Costs: " + cost);

        System.out.println("Would you like to audition ? (y/n) \n");

        final String riskChoice = scanner.nextLine().toLowerCase();

        if(riskChoice.equals("y")) {

            person.setBankBalance(person.getBankBalance() - cost);

            final double randomProbability = random.nextDouble();

            if (randomProbability <= acceptanceRate) {

                final double multiplier = 1 + ( 3 * (1-acceptanceRate));

                final double returns = cost * multiplier;

                System.out.println("Your audition went well! A scholarship has earned you $" + returns);
                person.setBankBalance(person.getBankBalance() + returns);
            } else {
                System.out.println("Unfortunately, you were not called back ...  you have lost $" + cost);
            }
            System.out.println("Your current bank balance is $" + person.getBankBalance());

        }

    }
}
