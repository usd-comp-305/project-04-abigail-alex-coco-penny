package edu.sandiego.comp305;

import java.util.Random;
import java.util.Scanner;

public class MarriageMilestoneEvent implements MilestoneLifeEvent {


    @Override
    public void executeOn(final Character person, final Scanner scanner, final Random RNG) {
        System.out.println("\n*** MARRIAGE ***");
        System.out.println("Would you like to get married? (y/n)");

        final String choice = scanner.nextLine().toLowerCase();

        if(!choice.equals("y")) {
            System.out.println("You chose not to get married");
            return;
        }

        System.out.println("Enter your partner's name: ");
        final String partnerName = scanner.nextLine();

        final Partner partner = new Partner(partnerName, Age.ADULT, DNA.generateRandomDNA(RNG), 0.0);
        person.setPartner(partner);
    }
}
