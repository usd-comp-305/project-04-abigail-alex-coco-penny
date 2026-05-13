package edu.sandiego.comp305;

import java.util.Random;
import java.util.Scanner;

public class RetirementMilestoneEvent implements MilestoneLifeEvent {


    @Override
    public void executeOn(final Character person, final Scanner scanner, final Random random) {
        System.out.println("\n*** RETIREMENT ***");

        double retirementBonus = 0;

        if (person.getCareer() != null) {
            retirementBonus += person.getCareer().salary * 0.25;
        }

        person.setBankBalance(person.getBankBalance() + retirementBonus);

        System.out.println("Name: " + person.getName());
        System.out.println("Final Career: " + person.getCareer().title);
        System.out.println("Retirement Bonus: $" + retirementBonus);
        System.out.println("Final Bank Balance: $" + person.getBankBalance());

        if (person.getCar() != null) {
            System.out.println("Car Owned: " + person.getCar().getType()[0] + " " + person.getCar().getType()[1]);
        }

        if (person.getHouse() != null) {
            System.out.println("House Owned: " + person.getHouse());
        }

        System.out.println("\nThank you for playing!");

    }

}
