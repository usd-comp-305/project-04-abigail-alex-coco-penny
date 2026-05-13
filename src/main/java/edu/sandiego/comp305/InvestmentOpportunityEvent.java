package edu.sandiego.comp305;

import java.util.Random;
import java.util.Scanner;

public class InvestmentOpportunityEvent implements FinancialLifeEvent {

    private String description;

    private double cost;

    private double riskFactor;

    public InvestmentOpportunityEvent(final String description, final double cost, final double riskFactor) {
        this.description = description;

        this.cost = cost;

        this.riskFactor = riskFactor;
    }


    @Override
    public void executeOn(final Character person, final Scanner scanner, final Random random) {
        System.out.println("Investment Opportunity: " + description);
        System.out.println("Would you like to invest $" + cost + "? (y/n) \n");

        final String investmentChoice = scanner.nextLine().toLowerCase();

        if(investmentChoice.equals("y")) {
            System.out.println("$" + cost  + " have successfully been invested!\n");

            person.setBankBalance(person.getBankBalance() - cost);

            final double randomProbability = random.nextDouble();

            final double successRate = 1 - riskFactor;

            if(randomProbability <= successRate) {

                final double multiplier = 1 + (riskFactor * 3);

                final double returns = cost * multiplier;

                person.setBankBalance(person.getBankBalance() + returns);
                System.out.println("Your investment paid off! Your total return is $" + returns);

            } else {
                final double multiplier = 1 - riskFactor;

                final double returns = cost * multiplier;

                person.setBankBalance(person.getBankBalance() + returns);
                System.out.println("Your investment did not pay off ... You kept $" + returns + " of your investment\n");

            }

            System.out.println("Your updated bank balance is " + person.getBankBalance() + "\n");
        } else {

            System.out.println("$" + cost + " was not invested.\n");
        }

    }
}
