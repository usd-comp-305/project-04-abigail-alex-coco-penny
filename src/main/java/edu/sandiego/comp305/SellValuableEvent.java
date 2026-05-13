package edu.sandiego.comp305;

import java.util.Random;
import java.util.Scanner;

public class SellValuableEvent implements FinancialLifeEvent {

    final private String description;

    final private double price;

    final private double riskFactor;

    public SellValuableEvent(final String description, final double price, final double riskFactor) {
        this.description = description;
        this.price = price;
        this.riskFactor = riskFactor;
    }



    @Override
    public void executeOn(final Character person, final Scanner scanner, final Random random) {

        System.out.println("Your friend wants you to sell them your valuable, but ... it may go up in price");
        System.out.println("Valuable: " + description);
        System.out.println("Risk Factor: " + riskFactor);

        System.out.println("Would you like to take the risk? (y/n) \n");

        final String riskDecision = scanner.nextLine().toLowerCase();

        if(riskDecision.equals("y")) {

            person.setBankBalance(person.getBankBalance() + price);

            final double randomNum = random.nextDouble();

            final double successRate = 1 - riskFactor;

            if (randomNum <= successRate) {

                System.out.println("Congratulations, you sold your item a good time!");

            } else {

                final double returns = (3 * price) - price;
                System.out.println("Unfortunately, the price of your item has increased 3x! You lost out on $" + returns);
                person.setBankBalance(person.getBankBalance() - returns);
            }


            System.out.println("Your updated bank balance is: $" + person.printedFormatBankBalance() + "\n");
        }


    }
}
