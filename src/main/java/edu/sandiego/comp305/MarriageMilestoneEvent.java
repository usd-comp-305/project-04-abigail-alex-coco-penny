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

        // use rng to randomly pick career and location instead of Simulator.chooseRandomOption
        final Career partnerCareer = Career.values()[RNG.nextInt(Career.values().length)];
        final Location partnerLocation = Location.values()[RNG.nextInt(Location.values().length)];

        final Partner partner = new Partner(partnerName, Age.ADULT, DNA.generateRandomDNA(RNG), 0.0);

        partner.chooseCareer(partnerCareer);
        partner.chooseLocation(partnerLocation);
        partner.calculateBankBalance();

        final Phenotype partnerPhenotype = partner.getPhenotype();
        System.out.println("\nYour partner has been created! Here are their traits");
        System.out.println("Eye Color: " + partnerPhenotype.getEyeColor());
        System.out.println("Height: " + partnerPhenotype.getHeight());
        System.out.println("Hair Color: " + partnerPhenotype.getHairColor());
        System.out.println("Career: " + partner.getCareer().title);
        System.out.println("\nCongratulations on your marriage!");

        person.setPartner(partner);
    }
}
