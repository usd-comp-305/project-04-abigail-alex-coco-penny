package edu.sandiego.comp305;

import java.util.Random;
import java.util.Scanner;

public class BuyingHouseMilestoneEvent implements MilestoneLifeEvent {


    @Override
    public void executeOn(final Character person, final Scanner scanner, final Random RNG) {
        System.out.println("\n*** HOUSE PURCHASE ***");
        System.out.println("Would you like to buy a house? (y/n)");

        final String choice = scanner.nextLine().toLowerCase();

        if (!choice.equals("y")) {
            System.out.println("You chose not to buy a house.");
            return;
        }

        final House[] houses = House.values();
        final House house = houses[RNG.nextInt(houses.length)];
        person.buyHouse(house);
        person.setBankBalance(person.getBankBalance() - house.getMortgageBalance());

        System.out.println("You bought: " + house);
        System.out.println("Mortgage Cost: $" + house.getMortgageBalance());
        System.out.println("Updated bank balance: $" + person.printedFormatBankBalance());
    }
}
